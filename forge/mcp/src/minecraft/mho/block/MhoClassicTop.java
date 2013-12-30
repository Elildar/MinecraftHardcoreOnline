package mho.block;

import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MhoClassicTop extends Block {
	
	boolean opaque;
	private Icon faceIcon;
	private Icon topIcon;
	
	public MhoClassicTop(int ID, int Texture, String Name, Boolean opacity) {
		super(ID, Material.wood); //The ID and material (The material defines what tools are better on it)
		setHardness(1.0F); //How hard the block is to break
		setResistance(1.0F); //How well the block resists explosions
		opaque = opacity;
		setStepSound(super.soundGrassFootstep); //The sound the block makes when you walk on it as well as place or break it
		GameRegistry.registerBlock(this, Name);
		LanguageRegistry.addName(this, Name);
	}
	
	public boolean isOpaqueCube()
    {
        return opaque;
    }
	
	@SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
             this.topIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"Top");
             this.faceIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"TopFace");
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int side, int meta)
    {
    	if (side == 1 || side == 0) {
    		return topIcon;
    	}
    	else {
    		return faceIcon;
    	}
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

}
