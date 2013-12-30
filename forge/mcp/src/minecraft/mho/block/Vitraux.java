package mho.block;

import java.util.List;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;

public class Vitraux extends BlockGlass {
	
	private boolean localFlag = false;
	public Icon[] iconArray;
	
	public Vitraux(int par1) {
		super(par1, Material.glass, true);
		setHardness(0.3F);
		setStepSound(Block.soundGlassFootstep); 
		setCreativeTab(Mho.tabMhoBlocks);
		setStepSound(soundGlassFootstep);
	}
	
	public boolean isOpaqueCube()
    {
        return false;
    }
	
	public boolean renderAsNormalBlock()
    {
        return false;
    }
	
	public int getBlockTextureFromSideAndMetadata(int par1, int par2){ //The different textures fo different metadatas
		if (par2 == 0)
        {
            return 48;
        }
        else
        {
            return 48 + par2;
        }
	}

	public int damageDropped(int i){ //Tells it what block it drops and also for creative mode pick block
		return i;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.iconArray = new Icon[16];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            this.iconArray[i] = par1IconRegister.registerIcon(Mho.modid + ":" + "vitrail_" + i);
        }
    }
	
	@SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int side, int meta)
    {
    	return this.iconArray[meta];
    }
	
	@SideOnly(Side.CLIENT)
	public int getRenderBlockPass() //Put 0 for fully transparent or opaque blocks, and 1 for semi-transparent
	{
	         return 1;
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List) //Adds the metadata blocks to the creative inventory
	{
		for (int var4 = 0; var4 < 16; ++var4)
		{
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}
	
	@SideOnly(Side.CLIENT)

    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates.  Args: blockAccess, x, y, z, side
     */
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        int var6 = par1IBlockAccess.getBlockId(par2, par3, par4);
        return !this.localFlag && var6 == this.blockID ? false : super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, par5);
    }
}
