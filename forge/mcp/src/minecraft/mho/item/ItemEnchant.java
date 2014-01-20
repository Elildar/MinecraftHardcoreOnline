package mho.item;

import mho.Mho;

public class ItemEnchant extends ItemMho {

	public ItemEnchant(int id, String name, String info, int rare) {
		super(id, name, 64, info, rare, false);
		this.setUnlocalizedName("MHO" + name + rare);
		this.setTextureName(Mho.modid + ":enchant/" + name);
		this.setCreativeTab(Mho.tabMhoEnchant);
	}
}
