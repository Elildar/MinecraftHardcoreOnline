package mho.common;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.AchievementList;
import cpw.mods.fml.common.ICraftingHandler;

public class CraftingHandler implements ICraftingHandler 
{
	@Override
	public void onCrafting(EntityPlayer player, ItemStack item,
			IInventory craftMatrix) {
		
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
		/**if (item.itemID == mho.obsidianIngot.itemID)
        {
                player.addStat(mho.obsiIngot, 1);
        }**/
	}
}