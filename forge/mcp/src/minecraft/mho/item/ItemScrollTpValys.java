package mho.item;

import mho.core.common.TeleportInformation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemScrollTpValys extends ItemMho {

	private int chance;
	private TeleportInformation data;
	
	public ItemScrollTpValys(int id, String name, String info, int chancePercentage, TeleportInformation data) {
		super(id, name, 1, info, 6, false);
		this.chance = chancePercentage;
		this.data = data;
	}
	
	public boolean onItemUse(ItemStack is, EntityPlayer player, World w, int x, int y, int z, int l, float f, float f1, float f3)
	{
		String thisworld = player.worldObj.getWorldInfo().getWorldName();
		
		if (this.data.activate == true && thisworld.equals("world")) {
			int random = (int)(Math.random() * (100-0)) + 0;
			if (random >= 100 - chance) {
				player.setPosition(this.data.x, this.data.y, this.data.z);
			}
			--is.stackSize;
			return true;
		}
		else {
			return false;
		}
	}
}
