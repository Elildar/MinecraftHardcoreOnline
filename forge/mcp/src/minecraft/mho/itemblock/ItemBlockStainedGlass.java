package mho.itemblock;

import mho.Mho;
import net.minecraft.block.BlockColored;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

	public class ItemBlockStainedGlass extends ItemBlock
	{
		public ItemBlockStainedGlass(int par1)
		{
			super(par1);
			this.setMaxDamage(0); //Stops bad things from happening
			this.setHasSubtypes(true); //Tells it that it has metadata versions
		}
		
		@SideOnly(Side.CLIENT)
		public Icon getIconFromDamage(int par1) //Gets the texture
		{
			return Mho.metaVitrail.getIcon(2, par1);
		}
		
		public int getMetadata(int par1) //Returns the metadata value
		{
			return par1;
		}

	    @Override
	    public String getUnlocalizedName(ItemStack par1ItemStack)
	    {
	        return super.getUnlocalizedName() + "." + ItemDye.dyeColorNames[BlockColored.getBlockFromDye(par1ItemStack.getItemDamage())];
	    }
		/*
		public String getItemNameIS(ItemStack is) //Get's the item incode name from an itemstack
		{
			String[] types = {"Blanc","Orange","Magenta", "Bleu clair", "Jaune", "Vert", "Rose", "Gris fonce", "Gris", "Cyan", "Violet", "Bleu", "Marron", "Vert fonce", "Rouge", "Noir"};
			return "Vitrail" + types[is.getItemDamage()];
		}*/
	}