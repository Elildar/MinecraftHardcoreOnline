package mho.core.common;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.world.World;

public class ContainerWorkbenchMho extends ContainerWorkbench
{
	public ContainerWorkbenchMho(InventoryPlayer par1InventoryPlayer, World par2World, int par3, int par4, int par5) 
	{
		super(par1InventoryPlayer, par2World, par3, par4, par5);
	}

    /**
     * Allow the API window of ItemPocketCraftingTable to stay.
     */
	public boolean canInteractWith(EntityPlayer par1EntityPlayer)
	{
		return true;
	}
}