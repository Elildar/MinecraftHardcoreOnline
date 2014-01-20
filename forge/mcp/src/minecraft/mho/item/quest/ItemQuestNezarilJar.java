package mho.item.quest;

import mho.Mho;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemQuestNezarilJar extends ItemQuest {
	
	public ItemQuestNezarilJar(int id, String name) {
		super(id, name, 1, null, false);
	}

	public boolean onItemUse(ItemStack is, EntityPlayer player, World w, int x, int y, int z, int l, float f, float f1, float f3)
	{
		double distance = player.getDistance(-700, 67, 1538);
		
		if (distance <= 50) {
			--is.stackSize;
			player.inventory.addItemStackToInventory(new ItemStack(Mho.nezarilJarFull));
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean onDroppedByPlayer(ItemStack is, EntityPlayer player) {
		return false;
	}
}
