package mho.potion;

import java.util.List;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class PotionApnee extends ItemFood
{
	
	public final int itemUseDuration;
    private final int healAmount;
    private final boolean isWolfsFavoriteMeat;
    private boolean alwaysEdible;
    private final float saturationModifier;
    
    public PotionApnee(int par1, int par2, boolean par4, String Name)
    {
        super(par1, par2, par4);
        maxStackSize = 1;
        this.itemUseDuration = 32;
        this.healAmount = par2;
        this.isWolfsFavoriteMeat = par4;
        this.saturationModifier = 0.0F;
        this.setCreativeTab(Mho.tabMhoPotions);
        this.setPotionEffect(Potion.waterBreathing.id, 180, 0, 1.0F);
		LanguageRegistry.addName(this, Name);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
	 {
	     this.itemIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getUnlocalizedName());
	 }
	
	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        --par1ItemStack.stackSize;
        par3EntityPlayer.getFoodStats().addStats(this);
        par2World.playSoundAtEntity(par3EntityPlayer, "random.burp", 0.5F, par2World.rand.nextFloat() * 0.1F + 0.9F);
        this.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
        return par1ItemStack;
    }
	
	public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 32;
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
    
    public int getHealAmount()
    {
        return this.healAmount;
    }

    public float getSaturationModifier()
    {
        return this.saturationModifier;
    }

    public boolean isWolfsFavoriteMeat()
    {
        return this.isWolfsFavoriteMeat;
    }
    
    public PotionApnee setAlwaysEdible()
    {
        this.alwaysEdible = true;
        return this;
    }
    
	@Override
	public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B)
	{
		l.add("Apnee I - 3 minutes");
	}

}