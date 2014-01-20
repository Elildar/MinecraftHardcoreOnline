package mho.item.combat;

import java.util.List;

import mho.Mho;
import mho.core.common.CustomItemRarity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemSwordMho extends ItemSword {

	private String AddInfo;
	private int Rarity;
	private boolean Effect;
	
	public ItemSwordMho(int id, EnumToolMaterial par2EnumToolMaterial, String name, String info, int rare, boolean effet) {
		super(id, par2EnumToolMaterial);
		this.AddInfo = info;
		this.Rarity = rare;
		this.Effect = effet;
		this.setUnlocalizedName("MHOcombat" + name);
		this.setTextureName(Mho.modid + ":combat/" + name);
		this.setCreativeTab(Mho.tabMhoCombat);
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
