package wraith.musica;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.metadata.ModMetadata;
import net.minecraft.util.math.MathHelper;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class Config {

    public HashMap<String, HashMap<String, HashMap<String, Float>>> MOB_DROPS = new HashMap<>();
    public HashMap<String, HashMap<String, HashMap<String, Float>>> EXPLOSION_DROPS = new HashMap<>();
    public HashMap<String, HashMap<String, HashMap<String, Float>>> BLOCK_RIGHTCLICK_DROPS = new HashMap<>();
    public HashMap<String, HashMap<String, HashMap<String, Float>>> BLOCK_MINE_DROPS = new HashMap<>();
    public HashMap<String, HashMap<String, Float>> TREASURES = new HashMap<>();

    private boolean musicMixerCrafting = true;

    private static Config instance = null;
    private boolean overrideConfigs = true;

    private Config(){}

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public boolean shouldOverrideConfigs() {
        return this.overrideConfigs;
    }

    public boolean canCraftDiscs() {
        return this.musicMixerCrafting;
    }

    public void parseConfig() {
        JsonObject json = getJsonObject(Config.readFile(new File("config/musica/config.json")));
        if (json != null && json.has("enable_music_disc_crafting")) {
            this.musicMixerCrafting = json.get("enable_music_disc_crafting").getAsBoolean();
        }
        if (json != null && json.has("use_default_drop_configs")) {
            this.overrideConfigs = json.get("use_default_drop_configs").getAsBoolean();
        }

        json = getJsonObject(Config.readFile(new File("config/musica/drops_when_X_is_killed_by_Y_with_drop_chance.json")));
        if (json != null) {
            loadDrops(json, MOB_DROPS);
        }

        json = getJsonObject(Config.readFile(new File("config/musica/drops_when_block_X_is_exploded_by_Y.json")));
        if (json != null) {
            loadDrops(json, EXPLOSION_DROPS);
        }

        json = getJsonObject(Config.readFile(new File("config/musica/drops_on_block_X_rightclicked_with_item_Y.json")));
        if (json != null) {
            loadDrops(json, BLOCK_RIGHTCLICK_DROPS);
        }

        json = getJsonObject(Config.readFile(new File("config/musica/drops_on_block_X_mined_by_item_Y.json")));
        if (json != null) {
            loadDrops(json, BLOCK_MINE_DROPS);
        }

        json = getJsonObject(Config.readFile(new File("config/musica/chests_containing_discs.json")));
        if (json != null) {
            for (Map.Entry<String, JsonElement> chest : json.entrySet()) {
                HashMap<String, Float> discs = new HashMap<>();
                for (Map.Entry<String, JsonElement> item : chest.getValue().getAsJsonObject().entrySet()) {
                    discs.put(item.getKey().toLowerCase(), MathHelper.clamp(item.getValue().getAsFloat(), 0F, 100F));
                }
                TREASURES.put(chest.getKey(), discs);
            }
        }
    }

    private static void loadDrops(JsonObject json, HashMap<String, HashMap<String, HashMap<String, Float>>> map) {
        map.clear();
        for (Map.Entry<String, JsonElement> x : json.entrySet()) {
            JsonObject yList = x.getValue().getAsJsonObject();
            HashMap<String, HashMap<String, Float>> explosionSourceMap = new HashMap<>();
            for (Map.Entry<String, JsonElement> y : yList.entrySet()) {
                JsonObject items = y.getValue().getAsJsonObject();
                HashMap<String, Float> itemMap = new HashMap<>();
                for (Map.Entry<String, JsonElement> item : items.entrySet()) {
                    itemMap.put(item.getKey().toLowerCase(), MathHelper.clamp(item.getValue().getAsFloat(), 0F, 100F));
                }
                explosionSourceMap.put(y.getKey().toLowerCase(), itemMap);
            }
            map.put(x.getKey(), explosionSourceMap);
        }
    }

    public static void createFile(String path, String contents, boolean overwrite) {
        File file = new File(path);
        if (file.exists() && !overwrite) {
            return;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        file.setReadable(true);
        file.setWritable(true);
        if (contents == null || "".equals(contents)) {
            return;
        }
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(contents);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFile(File file) {
        String output = "";
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("\\Z");
            output = scanner.next();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return output;
    }

    public static void saveFilesFromJar(String dir, String outputDir, boolean overwrite) {
        JarFile jar = null;
        try {
            jar = new JarFile(Utils.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
        } catch (IOException | URISyntaxException e) {
            ModMetadata metadata = FabricLoader.getInstance().getModContainer(Musica.MOD_ID).get().getMetadata();
            String filename = "mods/wraith-" + Musica.MOD_ID + "-" + metadata.getVersion() + ".jar";
            try {
                jar = new JarFile(new File(filename));
            } catch (IOException ignored) {
            }
        }

        if (jar != null) {
            Enumeration<JarEntry> entries = jar.entries();
            while(entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                if (!entry.getName().startsWith(dir) || (!entry.getName().endsWith(".json"))) {
                    continue;
                }
                String[] segments = entry.getName().split("/");
                String filename = segments[segments.length - 1];
                if (entry.isDirectory()) {
                    continue;
                }
                InputStream is = Utils.class.getResourceAsStream("/" + entry.getName());
                String path = "config/" + Musica.MOD_ID + "/" + outputDir + ("".equals(outputDir) ? "" : File.separator) + filename;
                try {
                    inputStreamToFile(is, new File(path), !entry.getName().endsWith("config.json") && overwrite);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Launched from IDE.");
            File[] files = FabricLoader.getInstance().getModContainer(Musica.MOD_ID).get().getPath(dir).toFile().listFiles();
            for(File file : files) {
                if (file.isDirectory()) {
                    continue;
                }
                String[] segments = file.getName().split("/");
                String filename = segments[segments.length - 1];
                String path = "config/" + Musica.MOD_ID + "/" + outputDir + ("".equals(outputDir) ? "" : File.separator) + filename;
                try {
                    Config.createFile(path, FileUtils.readFileToString(file, StandardCharsets.UTF_8), !file.getName().endsWith("config.json") && overwrite);
                } catch (IOException e) {
                    Musica.LOGGER.warn("ERROR OCCURRED WHILE REGENERATING " + filename);
                    e.printStackTrace();
                }
            }
        }
    }

    private static void inputStreamToFile(InputStream inputStream, File file, boolean overwrite) throws IOException {
        if (!file.exists() || overwrite) {
            FileUtils.copyInputStreamToFile(inputStream, file);
        }
    }

    public static JsonObject getJsonObject(String json) {
        try {
            return new JsonParser().parse(json).getAsJsonObject();
        } catch (Exception e) {
            e.printStackTrace();
            Musica.LOGGER.error("Error while parsing following json:\n\n" + json);
            return null;
        }
    }

}
