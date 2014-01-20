package mho.item;

import mho.core.common.ContainerWorkbenchMho;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet100OpenWindow;
import net.minecraft.world.World;

public class ItemPocketCraftingTable extends ItemMho 
{
	public ItemPocketCraftingTable(int id, String name, String info) {
		super(id, name, 64, info, 2, false);
	}
	
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	 {
		 int par1 = 1; //damage per use

		 if (getMaxDamage()==0) par1 = 0;

		 if (!((EntityPlayer)player).capabilities.isCreativeMode)
        {
			 stack.setItemDamage(stack.getItemDamage() + par1);
        }

        if (stack.getItemDamage() >= getMaxDamage() && par1 != 0)
        {
       	 player.renderBrokenItemStack(stack);

            --stack.stackSize;

            if (stack.stackSize < 0)
            {
           	 stack.stackSize = 0;
            }

            stack.setItemDamage(0);
        }
        if (!world.isRemote)
        {
       	 EntityPlayerMP playerMP = ((EntityPlayerMP) player);
       	 playerMP.incrementWindowID();
       	 playerMP.playerNetServerHandler.sendPacketToPlayer(new Packet100OpenWindow(playerMP.currentWindowId, 1, "Portable Workbench", 9, true));
       	 player.openContainer = new ContainerWorkbenchMho(player.inventory, player.worldObj, 0, 0, 0);
       	 player.openContainer.windowId = playerMP.currentWindowId;
       	 player.openContainer.addCraftingToCrafters(playerMP);
        }
        --stack.stackSize;
		 return stack;
	 }

	 public boolean tryPlaceIntoWorld(ItemStack stack, EntityPlayer player, World world, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	 {
		 return false;
	 }
}