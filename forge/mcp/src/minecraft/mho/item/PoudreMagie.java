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
import net.minecraft.world.World;

public class PoudreMagie extends Item 
{	
	public PoudreMagie(int i, String Name) 
	{
		super(i);
		maxStackSize = 16;
		this.setCreativeTab(Mho.tabMhoItems);
	}

	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
	 {
	     this.itemIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getUnlocalizedName());
	 }
	
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	 {
		player.heal(4);
        --stack.stackSize;
		 return stack;
	 }
}