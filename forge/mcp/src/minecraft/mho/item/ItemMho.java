package mho.item;

import java.util.List;

import mho.Mho;
import mho.core.common.CustomItemRarity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemMho extends Item 
{
	private String AddInfo;
	private int Rarity;
	private boolean Effect;
	
	public ItemMho(int id, String name, int stack, String info, int rare, boolean effet) 
	{
		super(id);
		this.maxStackSize = stack;
		this.AddInfo = info;
		this.Rarity = rare;
		this.Effect = effet;
		this.setCreativeTab(Mho.tabMhoItems);
		this.setUnlocalizedName("MHO" + name);
		this.setTextureName(Mho.modid + ":" + name);
	}
	
	@Override
	public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B)
	{ 
		if (AddInfo == null) { return; }
		else l.add(AddInfo);
	}
	
	public EnumRarity getRarity(ItemStack is)
	{ 
        return Mho.proxy.getCustomRarityType(CustomItemRarity.getRarity(Rarity));
	}
	
	public boolean hasEffect(ItemStack is)
	{
		return Effect;
	}
}