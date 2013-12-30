package mho.item;

import java.util.List;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.ClientProxy;
import mho.common.CustomItemRarity;
import mho.common.Mho;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Insignes extends Item 
{
	public Insignes(int i, String Name) 
	{
		super(i);
		maxStackSize = 64;
		this.setCreativeTab(Mho.tabMhoInsignes);
	}
	
	public EnumRarity getRarity(ItemStack is)
	{ 
		return Mho.proxy.getCustomRarityType(CustomItemRarity.EPIC);
	}
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
	 {
	     this.itemIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getUnlocalizedName());
	 }
}