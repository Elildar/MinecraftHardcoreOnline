package mho.block.deco;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCoralBreath extends Block
{
	public BlockCoralBreath(int par1, String name) 
	{
		super(par1, Material.grass);
		this.setCreativeTab(Mho.tabMhoDecorations);
		this.setStepSound(Block.soundGrassFootstep);
		this.setUnlocalizedName("MHO"+name);
		this.setTextureName(name);
	}
	
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

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }
}
