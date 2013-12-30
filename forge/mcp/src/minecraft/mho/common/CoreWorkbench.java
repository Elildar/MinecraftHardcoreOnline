package mho.common;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.world.World;

public class CoreWorkbench extends ContainerWorkbench
{

	public CoreWorkbench(InventoryPlayer par1InventoryPlayer, World par2World, int par3, int par4, int par5) 
	{
		super(par1InventoryPlayer, par2World, par3, par4, par5);
	}

	 public boolean canInteractWith(EntityPlayer par1EntityPlayer)
	 {
		 return true;
	 }

}