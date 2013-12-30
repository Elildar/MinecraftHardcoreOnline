package mho.item.quest;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;
import mho.common.ClientProxy;
import mho.common.CustomItemRarity;
import mho.common.Mho;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class nezarilJar extends Item {
	
	public nezarilJar(int par1, String Name) {
		super(par1);
		maxStackSize = 1;
		this.setCreativeTab(Mho.tabMhoQuest);
		LanguageRegistry.addName(this, Name);
	}

	public boolean onItemUse(ItemStack is, EntityPlayer player, World w, int x, int y, int z, int l, float f, float f1, float f3)
	{
		double distance = player.getDistance(-700, 67, 1538);
		
		if (distance <= 50) {
			--is.stackSize;
			player.inventory.addItemStackToInventory(new ItemStack(Mho.nezarilJarFull));
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean onDroppedByPlayer(ItemStack is, EntityPlayer player) {
		return false;
	}
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
	 {
	     this.itemIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getUnlocalizedName());
	 }
	
	public EnumRarity getRarity(ItemStack is)
	{ 
		return Mho.proxy.getCustomRarityType(CustomItemRarity.MAGICAL);
	}
	
}
