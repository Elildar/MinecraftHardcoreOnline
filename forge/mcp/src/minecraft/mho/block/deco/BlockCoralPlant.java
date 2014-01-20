package mho.block.deco;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCoralPlant extends Block
{
	public BlockCoralPlant(int par1, String name) 
	{
		super(par1, Material.water);
		this.setCreativeTab(Mho.tabMhoDecorations);
		this.setStepSound(Block.soundGrassFootstep);
		this.setUnlocalizedName("MHO"+name);
		this.setTextureName(name);
	}
	
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        if (!this.canBlockStay(par1World, par2, par3, par4))
        {
        	par1World.setBlockToAir(par2, par3, par4);
        }
    }
	
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
		boolean result;
		result = canBlockStay(par1World, par2, par3, par4);
		return result;
    }
	
	public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
		boolean result = false;
		Block above = blocksList[par1World.getBlockId(par2, par3 +1, par4)];
		Block below = blocksList[par1World.getBlockId(par2, par3 - 1, par4)];
        	if ((below != null) && (below != waterStill) && (below != waterMoving)) {
        		if ((above == waterStill) || above == waterMoving) {
        			result = true;
        		}
        	}
		return result;
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

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }
}
