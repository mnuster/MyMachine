package com.mnuster.mymachine.init;

import com.mnuster.mymachine.item.ItemMM;
import com.mnuster.mymachine.item.ItemModuleBase;
import com.mnuster.mymachine.ref.MOD;
import com.mnuster.mymachine.ref.NAMES;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(MOD.ID)
public class ModItemsMM {

    public static final ItemMM moduleBase = new ItemModuleBase();

    public static void register() {
        GameRegistry.registerItem(moduleBase, NAMES.ITEMS.MODULE_BASE);
    }
}
