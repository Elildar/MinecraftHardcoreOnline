package mho.potion;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;

import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class TestSplash extends Item
{
	public TestSplash(int i, String Name) 
	{
		super(i);
		maxStackSize = 1;
        this.setCreativeTab(Mho.tabMhoPotions);
		LanguageRegistry.addName(this, Name);
	}
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
	 {
	     this.itemIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getUnlocalizedName());
	 }

  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
  {
    par3EntityPlayer.setItemInUse(par1ItemStack, getMaxItemUseDuration(par1ItemStack));
    return par1ItemStack;
  }

  public void onPlayerStoppedUsing(ItemStack itemstack, World world, EntityPlayer entityplayer, int i)
  {
    int var6 = getMaxItemUseDuration(itemstack) - i;
    if (!world.isRemote)
      world.spawnEntityInWorld(new EntityPotion(world, entityplayer, itemstack.getItemDamage()));
    entityplayer.addPotionEffect(new PotionEffect(Potion.poison.id, 3600, 5));
    entityplayer.inventory.decrStackSize(entityplayer.inventory.currentItem, 1);
  }

  public boolean getHasSubtypes()
  {
    return true;
  }

  public int getMaxItemUseDuration(ItemStack par1ItemStack)
  {
    return 72000;
  }

  public EnumAction getItemUseAction(ItemStack par1ItemStack)
  {
    return EnumAction.bow;
  }

}