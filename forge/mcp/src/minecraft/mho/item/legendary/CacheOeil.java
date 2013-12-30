package mho.item.legendary;
 
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
 
public class CacheOeil extends ItemArmor
{
    public CacheOeil(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, String Name)
    {
        super(par1, par2EnumArmorMaterial, par3, par4);
		maxStackSize = 1;
		this.setCreativeTab(Mho.tabMhoItems);
		LanguageRegistry.addName(this, Name);
    }

    /* in 1.5
    public String getArmorTextureFile(ItemStack par1)
    {
            return "cacheOeil";
    }
    */

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
    {
            return "mho:armure.cacheOeil";
    }
 
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
	 {
	     this.itemIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getUnlocalizedName());
	 }
}