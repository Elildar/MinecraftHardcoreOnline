package mho.block.deco;

import java.util.List;
import java.util.Random;

import mho.Mho;
import mho.world.WorldGenBigTreeMho;
import mho.world.WorldGenTreesMho;
import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSaplingMho extends BlockSapling {

	private final int[] woodIds;
	private final int[] leaveIds;
	
	public BlockSaplingMho(int id, String name, int[] woodIds, int[] leaveIds) {
		super(id);
        this.woodIds = woodIds;
        this.leaveIds = leaveIds;
		this.setHardness(0.0F);
		this.setStepSound(soundGrassFootstep);
        this.setCreativeTab(Mho.tabMhoDecorations);
		this.setUnlocalizedName("MHO"+name);
		this.setTextureName(name);
	}

    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int par1, int par2)
    {
        return this.blockIcon;
    }

    /**
     * Determine if saplings is in a 1*1 or 2*2 pattern.
     * @param inOutParam [x, y, z, outX, outY, outZ]
     * @param par5 Metadata
     * @return trunkSize.
     */
    public int saplingInSquarePattern(World par1World, int[] param, int par5)
    {
        for (int i1 = 0; i1 >= -1; --i1)
        {
            for (int j1 = 0; j1 >= -1; --j1)
            {
                if (this.isSameSapling(par1World, param[0] + i1, param[1], param[2] + j1, par5) && this.isSameSapling(par1World, param[0] + i1 + 1, param[1], param[2] + j1, par5) && this.isSameSapling(par1World, param[0] + i1, param[1], param[2] + j1 + 1, par5) && this.isSameSapling(par1World, param[0] + i1 + 1, param[1], param[2] + j1 + 1, par5))
                {
                	param[3] += i1;
                	param[5] += j1;
                	return (2);
                }
            }
        }
        return (1);
    }
    
    @Override
    public void growTree(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!TerrainGen.saplingGrowTree(par1World, par5Random, par2, par3, par4)) return;
        int[] inOutParam = {par2, par3, par4, par2, par3, par4};
        int trunkSize = saplingInSquarePattern(par1World, inOutParam, 0);
        par2 = inOutParam[3]; par3 = inOutParam[4]; par4 = inOutParam[5];
        
        int meta = par1World.getBlockMetadata(par2, par3, par4) & 3;
        WorldGenerator object = new WorldGenTreesMho(true, 5,  this.woodIds, this.leaveIds);

        if (trunkSize > 1 || par5Random.nextInt(10) == 0)
        {
            object = new WorldGenBigTreeMho(true, 5,  this.woodIds, this.leaveIds, trunkSize);
        }

        par1World.setBlock(par2, par3, par4, 0, 0, 4);
        if (!object.generate(par1World, par5Random, par2, par3, par4))
        {
            par1World.setBlock(par2, par3, par4, this.blockID, meta, 4);
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }
}
