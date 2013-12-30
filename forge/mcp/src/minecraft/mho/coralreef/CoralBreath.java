package mho.coralreef;

import java.util.Random;

import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CoralBreath extends Block
{
	public CoralBreath(int par1, String Name) 
	{
		super(par1, Material.grass);
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
	
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5) {}
	
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
		return true;
    }
	
	public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
		return true;
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
