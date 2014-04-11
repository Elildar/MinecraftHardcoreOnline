package mho.block.generic;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.util.Icon;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockStairsMho extends BlockStairs {

    private final Block modelBlock;
    private final int metadata;
	
	public BlockStairsMho(int par1, Block par2Block, int par3, String name) {
		super(par1, par2Block, par3);
		this.modelBlock = par2Block;
		this.metadata = par3;
		this.setLightOpacity(1);
		this.setCreativeTab(Mho.tabMhoStairs);
		this.setUnlocalizedName("MHO"+name);
	}

    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int par1, int par2)
    {
        if (modelBlock == Block.grass)
            return this.modelBlock.getIcon(1, this.metadata);
        return this.modelBlock.getIcon(par1, this.metadata);
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
	
    /**
     * Returns the color this block should be rendered. Used by leaves.
     */
	@SideOnly(Side.CLIENT)
    public int getRenderColor(int par1)
    {
        return this.getBlockColor();
    }
}
