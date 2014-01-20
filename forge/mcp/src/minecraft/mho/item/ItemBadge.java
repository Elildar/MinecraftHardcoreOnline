package mho.item;

import mho.Mho;

public class ItemBadge extends ItemMho 
{
	public ItemBadge(int id, String name) {
		super(id, name, 64, null, 6, false);
		this.setUnlocalizedName("MHO" + name);
		this.setTextureName(Mho.modid + ":badge/" + name);
		this.setCreativeTab(Mho.tabMhoItems);
	}
}