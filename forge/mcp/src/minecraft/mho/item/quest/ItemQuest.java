package mho.item.quest;

import mho.Mho;
import mho.item.ItemMho;

public class ItemQuest extends ItemMho {

	public ItemQuest(int id, String name, int stack, String info, boolean effet) {
		super(id, name, stack, info, 4, effet);
		this.setCreativeTab(Mho.tabMhoQuest);
		this.setUnlocalizedName("MHOquest" + name);
		this.setTextureName(Mho.modid + ":quest/" + name);
	}
}
