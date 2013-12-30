package mho.block.nature;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class MhoLog extends BlockLog {
	
	private Icon topIcon;
	private Icon faceIcon;
	
	public MhoLog(int par1, String Name) {
		super(par1);
		this.setCreativeTab(Mho.tabMhoBlocks);
		GameRegistry.registerBlock(this);
		LanguageRegistry.addName(this, Name);
	}
	
	//OLD METHOD
	//public int getBlockTextureFromSideAndMetadata(int par1, int par2)
    //{
        //int var3 = par2 & 12;
        //int var4 = par2 & 3;
        //return var3 == 0 && (par1 == 1 || par1 == 0) ? this.blockIndexInTexture + 1/**/ : (var3 == 4 && (par1 == 5 || par1 == 4) ? this.blockIndexInTexture + 1/**/ : (var3 == 8 && (par1 == 2 || par1 == 3) ? this.blockIndexInTexture + 1/**/ : (var4 == 1 ? 24 : (var4 == 2 ? 25 : (var4 == 3 ? 26 : this.blockIndexInTexture/**/)))));
    //}
	
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
    }
	
	@SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
             this.topIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"Top");
             this.faceIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"Face");
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int side, int meta)
    {
    	if (side == 1 || side == 0) {
    		return topIcon;
    	}
    	else {
    		return faceIcon;
    	}
    }
}
