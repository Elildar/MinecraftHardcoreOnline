package mho.item;

import mho.Mho;

public class ItemDoll extends ItemMho {

	public ItemDoll(int id, String name) {
		super(id, name, 64, null, 2, false);
		this.setUnlocalizedName("MHO" + name);
		this.setTextureName(Mho.modid + ":doll/" + name);
	}
}
