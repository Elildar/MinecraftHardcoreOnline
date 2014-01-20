package mho.item;

import mho.Mho;

public class ItemGrey extends ItemMho {

	public ItemGrey(int id, String name, int stack, String info) {
		super(id, name, stack, info, 1, false);
		this.setUnlocalizedName("MHOgrey" + name);
		this.setTextureName(Mho.modid + ":grey/" + name);
		this.setCreativeTab(Mho.tabMhoGrey);
	}
}
