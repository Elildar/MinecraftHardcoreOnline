package mho.core.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

public class CraftEventHandler implements ICraftingHandler 
{
	@Override
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix) {
		//can add crafting achievements
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
		//can add smelting achievements
		/*
		if (item.itemID == mho.obsidianIngot.itemID)
        {
                player.addStat(mho.obsiIngot, 1);
        }
        */
	}
}