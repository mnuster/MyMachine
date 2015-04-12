package com.mnuster.mymachine.block;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;

public abstract class BlockContainerMM extends BlockMM implements ITileEntityProvider {
    protected BlockContainerMM(String unlocalizedName, Material material) {
        super(unlocalizedName, material);
    }
}
