package mho.item;
 
import java.util.List;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
 
public class PoeleSword extends ItemSword
{
    public PoeleSword(int itemID, EnumToolMaterial toolMaterial, String Name)
    {
        super(itemID, toolMaterial);
		maxStackSize = 1;
		this.setCreativeTab(Mho.tabMhoItems);
	}
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
             this.itemIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getUnlocalizedName());
    }
	
	@Override
	public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B)
	{
		l.add("Booong!!");
	}

}