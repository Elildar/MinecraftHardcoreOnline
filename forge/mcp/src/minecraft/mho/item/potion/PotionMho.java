package mho.item.potion;

import java.util.List;

import mho.Mho;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PotionMho extends ItemFood {
// TODO extend Potion
	private String addInfo;
	
	public PotionMho(int id, String name, String info)
    {
        super(id, 0, 0.0F, false);
        this.maxStackSize = 1;
        this.addInfo = info;
        this.setCreativeTab(Mho.tabMhoPotions);
		this.setUnlocalizedName("MHOpotion" + name);
		this.setTextureName(Mho.modid + ":potion/" + name);
	}

    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.drink;
    }

    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        return par1ItemStack;
    }
    
	@Override
	public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B)
	{ 
		if (addInfo == null) { return; }
		else l.add(addInfo);
	}
}
