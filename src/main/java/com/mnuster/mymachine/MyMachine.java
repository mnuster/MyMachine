package com.mnuster.mymachine;

import com.mnuster.mymachine.REF.MOD;
import com.mnuster.mymachine.config.ConfigHandler;
import com.mnuster.mymachine.init.ModItemsMM;
import com.mnuster.mymachine.proxy.IProxy;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MOD.ID, name = MOD.NAME, version = MOD.VERSION)
public class MyMachine {
    @Mod.Instance(MOD.ID)
    public static MyMachine instance;

    @SidedProxy(clientSide = MOD.CLIENT_PROXY, serverSide = MOD.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Load configs
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

        // Register items
        ModItemsMM.register();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}
