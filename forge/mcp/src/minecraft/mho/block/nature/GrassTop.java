package mho.block.nature;

import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GrassTop extends Block {
	public GrassTop(int par1, String Name) {
		super(par1, Material.grass);
		setStepSound(Block.soundGrassFootstep);
		setLightOpacity(0);
		GameRegistry.registerBlock(this);
		LanguageRegistry.addName(this, Name);
	}
	
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }
	
	public int getRenderType()
    {
        return 1;
    }
	
	public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
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
		Block below = blocksList[par1World.getBlockId(par2, par3 - 1, par4)];
		int belowint = par1World.getBlockId(par2, par3 - 1, par4);
		int thisid = par1World.getBlockId(par2, par3, par4);
		
        if (belowint == thisid - 1) {
        	return true;
        }
        else {
        	return false;
        }
    }
	
	public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
		Block below = blocksList[par1World.getBlockId(par2, par3 - 1, par4)];
		int belowint = par1World.getBlockId(par2, par3 - 1, par4);
		int thisid = par1World.getBlockId(par2, par3, par4);
		
        if (belowint == thisid - 1) {
        	return true;
        }
        else {
        	return false;
        }
		
    }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }
}
