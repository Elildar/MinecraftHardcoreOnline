package mho.block;

import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MhoBatonBot extends Block {
	public MhoBatonBot(int par1, int par2, String Name) {
		super(par1, Material.grass);
		setStepSound(Block.soundGrassFootstep);
		setCreativeTab(Mho.tabMhoBlocks);
		setLightOpacity(0);
		GameRegistry.registerBlock(this);
		LanguageRegistry.addName(this, Name);
	}
	
	public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
    {
		par1World.setBlock(par2, par3 + 1, par4, this.blockID+1);
		return par9;
    }
	
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
		return null;
    }
	
	public int getRenderType()
    {
        return 2;
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
	
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
		boolean result = false;
		Block below = blocksList[par1World.getBlockId(par2, par3 - 1, par4)];
		Block above = blocksList[par1World.getBlockId(par2, par3 + 1, par4)];
        	if (below != null) {
        		if (above == null) {
        			result = true;
        		}	
        	}
       
		return result;
    }
	
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        if (!this.canBlockStay(par1World, par2, par3, par4))
        {
            par1World.setBlockToAir(par2, par3, par4);
        }
    }
	
	public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
		boolean result = false;
		Block below = blocksList[par1World.getBlockId(par2, par3 - 1, par4)];
		Block above = blocksList[par1World.getBlockId(par2, par3 + 1, par4)];
		int aboveint = par1World.getBlockId(par2, par3+1, par4);
		int thisid = par1World.getBlockId(par2, par3, par4);
		
        if ((aboveint == thisid +1)) {
        	if (below != null) {
        		result = true;
        	}
        }
		
        return result;
		
    }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }
}
