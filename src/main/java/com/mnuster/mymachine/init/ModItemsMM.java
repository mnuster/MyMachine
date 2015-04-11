package com.mnuster.mymachine.init;

import com.mnuster.mymachine.item.ItemMM;
import com.mnuster.mymachine.item.ItemModuleBase;
import com.mnuster.mymachine.ref.ITEMS;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItemsMM {

    public static final ItemMM moduleBase = new ItemModuleBase();

    public static void register() {
        GameRegistry.registerItem(moduleBase, ITEMS.MODULE_BASE.KEY);
    }
}
