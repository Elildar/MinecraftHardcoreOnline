package mho.block.build;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDoubleCrateBot extends Block {
	
	private Icon faceIcon;
	private Icon topIcon;
	
	public BlockDoubleCrateBot(int ID, String name) {
		super(ID, Material.wood); //The ID and material (The material defines what tools are better on it)
		setHardness(1.0F); //How hard the block is to break
		setResistance(1.0F); //How well the block resists explosions
		setStepSound(super.soundWoodFootstep); //The sound the block makes when you walk on it as well as place or break it
		setCreativeTab(Mho.tabMhoBlocks); //The tab it appears in
		this.setUnlocalizedName("MHO"+name+"Lower");
		this.setTextureName(name);
	}
	
	@SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
             this.topIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"Top");
             this.faceIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"Lower");
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
	
	public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
    {
		par1World.setBlock(par2, par3 + 1, par4, this.blockID+1);
		return par9;
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

}
