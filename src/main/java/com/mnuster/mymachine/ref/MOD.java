package com.mnuster.mymachine.ref;

import com.mnuster.mymachine.init.ModItemsMM;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MOD {
    // Mod info
    public static final String ID = "mymachine";
    public static final String NAME = "My Machine";
    public static final String MOD_VERSION = "1.0";
    public static final String MC_VERSION = "1.7.10";
    public static final String VERSION = MC_VERSION + "-" + MOD_VERSION;
    public static final String TEXTURE_LOC = ID;

    // Mod code things
    public static final String PACKAGE = "com.mnuster.mymachine";
    public static final String CLIENT_PROXY = PACKAGE + ".proxy.ClientProxy";
    public static final String SERVER_PROXY = PACKAGE + ".proxy.ServerProxy";

    // General Things
    public static final CreativeTabs TAB = new CreativeTabs(MOD.ID) {
        @Override
        public Item getTabIconItem() {
            return ModItemsMM.moduleBase;
        }
    };
}
