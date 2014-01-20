package mho.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemMagicPowder extends ItemMho 
{	
	public ItemMagicPowder(int id, String name, String info) {
		super(id, name, 16, info, 2, false);
	}

	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	 {
		player.heal(4);
        --stack.stackSize;
		 return stack;
	 }
}