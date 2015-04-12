package com.mnuster.mymachine.block;

import com.mnuster.mymachine.ref.MOD;
import com.mnuster.mymachine.tileentity.TileEntityMM;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockMM extends Block {

    private String baseName;

    public BlockMM(String newBaseName, Material material) {
        super(material);
        baseName = newBaseName;
        setBlockName(baseName);
        setBlockTextureName(MOD.ID + ":" + baseName);
        setCreativeTab(MOD.TAB);
        setHardness(2F);
        setHarvestLevel("axe", 1);
    }

    @Override
    public String getUnlocalizedName() {
        return MOD.ID + ":" + super.getUnlocalizedName();
    }

    public String getStrippedName() {
        return MOD.ID + ":" + baseName;
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLiving, ItemStack itemStack) {
        super.onBlockPlacedBy(world, x, y, z, entityLiving, itemStack);

        if (world.getTileEntity(x, y, z) instanceof TileEntityMM) {
            int direction = 0;
            int facing = MathHelper.floor_double(entityLiving.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;

            if (facing == 0) {
                direction = ForgeDirection.NORTH.ordinal();
            } else if (facing == 1) {
                direction = ForgeDirection.EAST.ordinal();
            } else if (facing == 2) {
                direction = ForgeDirection.SOUTH.ordinal();
            } else if (facing == 3) {
                direction = ForgeDirection.WEST.ordinal();
            }

            ((TileEntityMM) world.getTileEntity(x, y, z)).setOrientation(direction);
        }
    }
}
