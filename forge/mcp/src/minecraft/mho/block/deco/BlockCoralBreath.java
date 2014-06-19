package mho.block.deco;

import java.util.Random;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCoralBreath extends Block
{
	public BlockCoralBreath(int par1, String name) 
	{
		super(par1, Material.water);
		this.setTickRandomly(true);
		this.setCreativeTab(Mho.tabMhoDecorations);
		this.setStepSound(Block.soundGrassFootstep);
		this.setUnlocalizedName("MHO"+name);
		this.setTextureName(name);
	}
	
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
		return canBlockStay(par1World, par2, par3, par4);
    }
	
	public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
		boolean result = false;
		Block above = blocksList[par1World.getBlockId(par2, par3 +1, par4)];
		Block below = blocksList[par1World.getBlockId(par2, par3 - 1, par4)];
        	if ((below != null) && (below.isOpaqueCube() || below.blockID == this.blockID)) {
        		if ((above != null) && (above.blockMaterial == Material.water || above.isOpaqueCube())) {
        			result = true;
        		}
        	}
		return result;
    }

	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (par1World.getBlockId(par2, par3 + 1, par4) == waterStill.blockID)
        {
            int var6;

            for (var6 = 1; par1World.getBlockId(par2, par3 - var6, par4) == this.blockID; ++var6)
            {
                ;
            }

            if (var6 < 3)
            {
                int var7 = par1World.getBlockMetadata(par2, par3, par4);

                if (var7 == 15)
                {
                    par1World.setBlock(par2, par3 + 1, par4, this.blockID);
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 4);
                }
                else
                {
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, var7 + 1, 4);
                }
            }
        }
    }

    @SideOnly(Side.CLIENT)

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        float f = par5Random.nextFloat();
        float f1 = par5Random.nextFloat();
        float f2 = par5Random.nextFloat();
        par1World.spawnParticle("bubble", par2 + (double)f, par3 + (double)f1, par4 + (double)f2, 0, 0, 0);
    }

	public int getRenderType()
    {
        return 1;
    }
	
    public boolean isOpaqueCube()
    {
        return false;
    }
    
	public boolean renderAsNormalBlock()
    {
        return false;
    }

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
		return null;
    }

	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
        par5Entity.setAir(300);
    }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }
}
