package mho.block;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import mho.common.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStep;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class StepBase extends BlockStep {
	int Texture;
	int metadata;
	Block modelBlock;
	
	public StepBase(int par1, Block par3, boolean par2, int meta, String Name) {
		super(par1, par2);
		setCreativeTab(Mho.tabMhoStep); //The tab it appears in
		setLightOpacity(0);
		setResistance(1.0F);
		setHardness(1.0F);
		modelBlock = par3;
		metadata = meta;
		GameRegistry.registerBlock(this);
		LanguageRegistry.addName(this, Name);
	}

    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2)
    {
        return this.modelBlock.getIcon(par1, this.metadata);
    }
/*
	public int getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
		if (modelBlock == Block.grass){
			return par1 == 1 ? 0 : (par1 == 0 ? 2 : 3);
		}
		if (Texture == 64) { //Si laine, application du metadata
			switch (metadata) {
			case 0 : return 64;
			case 1 : return 210;
			case 2 : return 194;
			case 3 : return 178;
			case 4 : return 162;
			case 5 : return 146;
			case 6 : return 130;
			case 7 : return 114;
			case 8 : return 225;
			case 9 : return 209;
			case 10 : return 193;
			case 11 : return 177;
			case 12 : return 161;
			case 13 : return 145;
			case 14 : return 129;
			case 15 : return 113;
			default : return 64;
			}
		}
		else if (Texture == 20) {
			switch (metadata) {
			case 0 : return par1 == 0 ? 21 : (par1 == 1 ? 21 : 20);
			case 1 : return par1 == 0 ? 21 : (par1 == 1 ? 21 : 116);
			case 2 : return par1 == 0 ? 21 : (par1 == 1 ? 21 : 117);
			case 3 : return par1 == 0 ? 21 : (par1 == 1 ? 21 : 153);
			default : return 20;
			}
		}
		else if (Texture == 54) {
			switch (metadata) {
			case 1 : return 100;
			case 2 : return 101;
			default : return 54;
			}
		}
		else {
			return Texture;
		}
    }
	*/
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
