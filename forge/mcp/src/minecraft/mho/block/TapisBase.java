package mho.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import mho.common.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class TapisBase extends Block {

	public TapisBase(int par1, Material par3Material, String Name) {
		super(par1, par3Material);
		setHardness(0.3F); //How hard the block is
		setResistance(0.1F); //How well the block resists explosions
		setStepSound(Block.soundClothFootstep); //The sounds the block makes
		setCreativeTab(Mho.tabMhoSurface); //The tab it appears in
		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.1F, 1.0F);
		setLightOpacity(0);
		GameRegistry.registerBlock(this, Name);
	}
	
	public boolean isOpaqueCube()
    {
        return false;
    }
	
	public boolean renderAsNormalBlock()
    {
        return false;
    }
	
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        int var5 = par1IBlockAccess.getBlockMetadata(par2, par3, par4) & 7;
        float var6 = (float)(2 * (1 + var5)) / 16.0F;
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.1F, 1.0F);
    }
	
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
		return null;
    }
	
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        return true;
    }
	
	public int damageDropped(int i){ //Tells it what block it drops and also for creative mode pick block
		return i;
	}

}
