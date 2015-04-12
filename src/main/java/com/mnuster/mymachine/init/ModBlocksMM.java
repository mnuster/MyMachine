package com.mnuster.mymachine.init;

import com.mnuster.mymachine.block.BlockMM;
import com.mnuster.mymachine.block.BlockMachineAssembler;
import com.mnuster.mymachine.ref.MOD;
import com.mnuster.mymachine.ref.NAMES;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(MOD.ID)
public class ModBlocksMM {

    public static final BlockMM machineAssembler = new BlockMachineAssembler();

    public static void register() {
        GameRegistry.registerBlock(machineAssembler, NAMES.BLOCKS.MACHINE_ASSEMBLER);
    }
}
