package mho.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemScrollTpValys extends ItemMho {

	private int chance;
	
	public ItemScrollTpValys(int id, String name, String info, int chancePercentage) {
		super(id, name, 1, info, 6, false);
		this.chance = chancePercentage;
	}
	
	public boolean onItemUse(ItemStack is, EntityPlayer player, World w, int x, int y, int z, int l, float f, float f1, float f3)
	{
		String thisworld = player.worldObj.getWorldInfo().getWorldName();
		
		if (thisworld == "world") {
			int random = (int)(Math.random() * (100-0)) + 0;
			if (random >= 100 - chance) {
				player.setPosition(-233, 91, 130);
			}
			--is.stackSize;
			return true;
		}
		else {
			return false;
		}
	}
}
