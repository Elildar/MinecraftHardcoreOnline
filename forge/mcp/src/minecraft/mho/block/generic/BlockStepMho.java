package mho.block.generic;

import java.util.List;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStep;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockStepMho extends BlockStep {

	private final Block modelBlock;
	int metadata;
	
	public BlockStepMho(int par1, Block par2Block, int meta, String name) {
		super(par1, false);
		this.modelBlock = par2Block;
		this.metadata = meta;
		this.setCreativeTab(Mho.tabMhoStairs);
		this.setLightOpacity(5);
		this.setResistance(1.0F);
		this.setHardness(1.0F);
		this.setUnlocalizedName("MHO"+name);
	}

    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta)
    {
		return this.modelBlock.getIcon(side, metadata);
    }

	@SideOnly(Side.CLIENT)
    public int getBlockColor()
    {
        if (modelBlock == Block.grass) {
        return ColorizerGrass.getGrassColor(0.5D, 1.0D);
        }
        else {
        	return 16777215;
        }
    }
	
	public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        if (modelBlock == Block.grass) {
        	int var5 = 0;
            int var6 = 0;
            int var7 = 0;

            for (int var8 = -1; var8 <= 1; ++var8)
            {
                for (int var9 = -1; var9 <= 1; ++var9)
                {
                    int var10 = par1IBlockAccess.getBiomeGenForCoords(par2 + var9, par4 + var8).getBiomeGrassColor();
                    var5 += (var10 & 16711680) >> 16;
                    var6 += (var10 & 65280) >> 8;
                    var7 += var10 & 255;
                }
            }

            return (var5 / 9 & 255) << 16 | (var6 / 9 & 255) << 8 | var7 / 9 & 255;
        }
        else {
        	return 16777215;
        }
    }
	
	@SideOnly(Side.CLIENT)

    /**
     * Returns the color this block should be rendered. Used by leaves.
     */
    public int getRenderColor(int par1)
    {
        return this.getBlockColor();
    }
	
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
		par3List.add(new ItemStack(par1, 1, 0));
    }
	
	public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return this.blockID;
    }
}
