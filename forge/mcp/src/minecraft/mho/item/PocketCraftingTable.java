package mho.item;

import java.util.List;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import mho.common.ClientProxy;
import mho.common.CoreWorkbench;
import mho.common.CustomItemRarity;
import mho.common.Mho;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet100OpenWindow;
import net.minecraft.world.World;

public class PocketCraftingTable extends Item 
{
	public PocketCraftingTable(int i, String Name) 
	{
		super(i);
		maxStackSize = 64;
		this.setCreativeTab(Mho.tabMhoItems);
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
       	 player.openContainer = new CoreWorkbench(player.inventory, player.worldObj, 0, 0, 0);
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
	 
	 @SideOnly(Side.CLIENT)
	    public void registerIcons(IconRegister par1IconRegister)
		 {
		     this.itemIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getUnlocalizedName());
		 }
}