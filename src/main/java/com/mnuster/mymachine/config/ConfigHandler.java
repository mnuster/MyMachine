package com.mnuster.mymachine.config;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {
    public static void init(File configFile) {
        Configuration config = new Configuration(configFile);

        try {
            // Load configs
            config.load();

            // Read in configs
            //config.get()
        } catch (Exception e) {
            // Log config error
        } finally {
            // Save configs
            config.save();
        }
    }
}
