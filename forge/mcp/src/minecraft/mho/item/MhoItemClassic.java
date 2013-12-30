package mho.item;

import java.util.List;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.ClientProxy;
import mho.common.CustomItemRarity;
import mho.common.Mho;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MhoItemClassic extends Item 
{
	String AddInfo;
	int Rarity;
	Boolean Effect;
	
	public MhoItemClassic(int i, String Name, int Stack, String info, int rare, Boolean effet) 
	{
		super(i);
		maxStackSize = Stack;
		this.setCreativeTab(Mho.tabMhoItems);
		AddInfo = info;
		Rarity = rare;
		Effect = effet;
	}
	
	@Override
	public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B)
	{ 
		if (AddInfo == null) { return; }
		else l.add(AddInfo);
	}
	
	public EnumRarity getRarity(ItemStack is)
	{ 
		switch (Rarity) {
        case 1:  return Mho.proxy.getCustomRarityType(CustomItemRarity.JUNK);
        case 2:  return Mho.proxy.getCustomRarityType(CustomItemRarity.NORMAL);
        case 3:  return Mho.proxy.getCustomRarityType(CustomItemRarity.UNCOMMON);
        case 4:  return Mho.proxy.getCustomRarityType(CustomItemRarity.MAGICAL);
        case 5:  return Mho.proxy.getCustomRarityType(CustomItemRarity.RARE);
        case 6:  return Mho.proxy.getCustomRarityType(CustomItemRarity.EPIC);
        case 7:  return Mho.proxy.getCustomRarityType(CustomItemRarity.LEGENDARY);
        default: return Mho.proxy.getCustomRarityType(CustomItemRarity.NORMAL);
        }
	}
	
	public boolean hasEffect(ItemStack is)
	{
		return Effect;
	}
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
	 {
	     this.itemIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getUnlocalizedName());
	 }
}