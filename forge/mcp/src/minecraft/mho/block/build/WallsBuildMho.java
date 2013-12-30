package mho.block.build;

import java.util.List;

import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class WallsBuildMho extends BlockWall {
	
	public Block modelBlock;
	
	public WallsBuildMho(int par1, Block par2Block, String Name) {
		super(par1, par2Block);
		setCreativeTab(Mho.tabMhoWalls); //The tab it appears in
		setLightOpacity(0);
		modelBlock = par2Block;
		GameRegistry.registerBlock(this);
		LanguageRegistry.addName(this, Name);
	}
	/*
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	    {
	        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + modelBlock.getTextureName());
	    }
	*/
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2)
    {
        return modelBlock.getBlockTextureFromSide(par1);
    }
	
	@SideOnly(Side.CLIENT)

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
    }
}	
