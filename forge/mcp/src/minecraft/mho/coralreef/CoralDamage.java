package mho.coralreef;

import java.util.Random;

import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CoralDamage extends Block
{
	
	public CoralDamage(int par1, String Name) 
	{
		super(par1, Material.water);
		setCreativeTab(Mho.tabMhoCoral);
		setStepSound(Block.soundGrassFootstep);
		GameRegistry.registerBlock(this, Name);
		LanguageRegistry.addName(this, Name);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }
	
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        if (!this.canBlockStay(par1World, par2, par3, par4))
        {
        	par1World.setBlockToAir(par2, par3, par4);
        }
    }
	
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
        par5Entity.attackEntityFrom(DamageSource.cactus, 1);
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

}
