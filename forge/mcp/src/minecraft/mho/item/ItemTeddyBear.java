package mho.item;

import mho.Mho;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTeddyBear extends ItemMho 
{
	public ItemTeddyBear(int id, String name) {
		super(id, name, 1, null, 7, false);
	}

	public ItemStack onItemRightClick(ItemStack teddy, World par2World, EntityPlayer player)
    {
        par2World.playSoundAtEntity(player, Mho.modid + ":item.peluche", 1.0F, 1.0F);

        return teddy;
    }
}