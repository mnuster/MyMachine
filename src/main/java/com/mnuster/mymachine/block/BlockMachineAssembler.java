package com.mnuster.mymachine.block;

import com.mnuster.mymachine.MyMachine;
import com.mnuster.mymachine.ref.NAMES;
import com.mnuster.mymachine.tileentity.TileEntityMachineAssembler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockMachineAssembler extends BlockContainerMM {

    @SideOnly(Side.CLIENT)
    private IIcon iconFront, iconSide, iconTop;

    public BlockMachineAssembler() {
        super(NAMES.BLOCKS.MACHINE_ASSEMBLER, Material.iron);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEntityMachineAssembler();
    }

//    @Override
//    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p6, float p7, float p8, float p9) {
//        if (!world.isRemote || !player.isSneaking()) {
//            if (world.getTileEntity(x, y, z) instanceof TileEntityMachineAssembler) {
//                player.openGui(MyMachine.instance, NAMES.GUIS.MACHINE_ASSEMBLER.ordinal(), world, x, y, z);
//            }
//        }
//        return true;
//    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
        iconFront = iconRegister.registerIcon(getStrippedName() + "_front");
        iconSide = iconRegister.registerIcon(getStrippedName() + "_side");
        iconTop = iconRegister.registerIcon(getStrippedName() + "_top");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side) {
        // Return top and bottom icon
        if (side == 0 || side == 1) return iconTop;

        // Find front of machine
        TileEntityMachineAssembler tileEntity = (TileEntityMachineAssembler)world.getTileEntity(x, y, z);
        if (tileEntity != null && side == tileEntity.getOrientation().ordinal()) return iconFront;

        // Return side
        return iconSide;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta) {
        // Necessary for rendering in the inventory?
        if (side == 0 || side == 1) return iconTop;
        if (side == ForgeDirection.WEST.ordinal()) return iconFront;
        return iconSide;
    }
}
