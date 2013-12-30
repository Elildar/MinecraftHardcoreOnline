package mho.itemblock;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemWoolLight extends ItemBlock {

	public ItemWoolLight(int par1) {
		super(par1);
		this.setMaxDamage(0); //Stops bad things from happening
        this.setHasSubtypes(true); //Tells it that it has metadata versions
	}
	
	public int getMetadata(int par1) //Returns the metadata value
	{
	         return par1;
	}
	public String getItemNameIS(ItemStack is) //Get's the item incode name from an itemstack
	{
	         String[] types = {"Blanc","Orange","Magenta", "Bleu claire", "Jaune", "Verte claire", "Rose", "Grise", "Grise claire", "Cyan", "Violette", "Bleu", "Marron", "Verte", "Rouge", "Noire"};
	         return "Laine lumineuse" + types[is.getItemDamage()];
	}

}
