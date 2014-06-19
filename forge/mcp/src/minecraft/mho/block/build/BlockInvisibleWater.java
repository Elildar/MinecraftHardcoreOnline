package mho.block.build;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockInvisibleWater extends Block {

	public BlockInvisibleWater(int ID, String name) {
		super(ID, Material.water);
		this.setLightOpacity(3);
		this.setStepSound(Block.soundStoneFootstep);
		this.setCreativeTab(Mho.tabMhoBlocks);
		this.setUnlocalizedName("MHO"+name+"Water");
		this.setTextureName(name);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
		return null;
    }

	public boolean renderAsNormalBlock()
    {
        return false;
    }
	
	public boolean isOpaqueCube()
    {
        return false;
    }
}