package mho.scroll;

import java.util.List;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.ClientProxy;
import mho.common.CustomItemRarity;
import mho.common.Mho;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class mediumValys extends Item {

	public mediumValys(int par1, String Name) {
		super(par1);
		maxStackSize = 1;
		this.setCreativeTab(Mho.tabMhoItems);
		LanguageRegistry.addName(this, Name);
	}
	
	public boolean onItemUse(ItemStack is, EntityPlayer player, World w, int x, int y, int z, int l, float f, float f1, float f3)
	{
		String thisworld = player.worldObj.getWorldInfo().getWorldName();
		
		if (thisworld=="world") {
			int random = (int)(Math.random() * (100-0)) + 0;
			if (random >=25) {
				player.setPosition(-233, 91, 130);
			}
			--is.stackSize;
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B)
	{ 
		l.add("Vous teleporte a Valys. Trois fois sur quatre.");
	}

	public EnumRarity getRarity(ItemStack is)
	{ 
		return Mho.proxy.getCustomRarityType(CustomItemRarity.LEGENDARY);
	}
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
	 {
	     this.itemIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getUnlocalizedName());
	 }
}
