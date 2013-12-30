package mho.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class BlockSixFaces extends BlockDirectional {

	private Icon topIcon;
	private Icon botIcon;
	private Icon northIcon;
	private Icon eastIcon;
	private Icon westIcon;
	private Icon southIcon;
	
	public BlockSixFaces(int par1, String Name) {
		super(par1, Material.rock);
		setCreativeTab(Mho.tabMhoBlocks);
		setStepSound(Block.soundWoodFootstep);
		GameRegistry.registerBlock(this, Name);
		LanguageRegistry.addName(this, Name);
	}
	
	@SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
             this.topIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"Top");
             this.botIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"Bot");
             this.northIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"North");
             this.eastIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"East");
             this.westIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"West");
             this.southIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"South");
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int side, int meta)
    {
    	switch (side) {
    	case 0: return botIcon;
    	case 1: return topIcon;
    	case 2: return eastIcon;
    	case 3: return westIcon;
    	case 4: return northIcon;
    	case 5: return southIcon;
    	default: return topIcon;
    	}
    }

}
