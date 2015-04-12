package com.mnuster.mymachine.tileentity;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

public class TileEntityMM extends TileEntity {

    private ForgeDirection orientation;

    public TileEntityMM() {
        orientation = ForgeDirection.NORTH;
    }

    public ForgeDirection getOrientation() {
        return orientation;
    }

    public void setOrientation(ForgeDirection newOrientation) {
        orientation = newOrientation;
    }

    public void setOrientation(int newOrientation) {
        orientation = ForgeDirection.getOrientation(newOrientation);
    }
}
