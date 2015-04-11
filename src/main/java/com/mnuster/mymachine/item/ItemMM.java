package com.mnuster.mymachine.item;

import com.mnuster.mymachine.REF.MOD;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemMM extends Item {

    public ItemMM(String unlocalizedName) {
        super();
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(MOD.ID + ":" + unlocalizedName);
        this.setCreativeTab(MOD.TAB);
    }

    @Override
    public String getUnlocalizedName() {
        return MOD.ID + ":" + super.getUnlocalizedName();
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return MOD.ID + ":" + super.getUnlocalizedName();
    }

//    protected String getStrippedName()
//    {
//        return super.getUnlocalizedName().substring(super.getUnlocalizedName().indexOf(".") + 1);
//    }
//
//    @Override
//    @SideOnly(Side.CLIENT)
//    public void registerIcons(IIconRegister iconRegister) {
//        itemIcon = iconRegister.registerIcon(MOD.ID + ":" + getStrippedName());
//    }
}
