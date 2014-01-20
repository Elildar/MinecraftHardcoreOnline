package mho.item.potion;

import mho.Mho;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class PotionLavaWalk extends PotionMho
{
    public PotionLavaWalk(int id, String name, String info)
    {
        super(id, name, info);
    }
    
	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        --par1ItemStack.stackSize;
        par3EntityPlayer.getFoodStats().addStats(this);
        par3EntityPlayer.addPotionEffect(new PotionEffect(Mho.effectPotionLavaWalk.id, 3600, 0));
        par2World.playSoundAtEntity(par3EntityPlayer, "random.burp", 0.5F, par2World.rand.nextFloat() * 0.1F + 0.9F);
        this.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
        return par1ItemStack;
    }
}