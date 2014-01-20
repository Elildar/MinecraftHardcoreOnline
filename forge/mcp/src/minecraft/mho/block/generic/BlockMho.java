package mho.block.generic;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMho extends Block {
	
	public BlockMho(int ID, Material par2Material, String name) {
		super(ID, par2Material);
		this.setHardness(1.0F);
		this.setResistance(1.0F);
		this.setStepSound(super.soundStoneFootstep);
		this.setCreativeTab(Mho.tabMhoBlocks);
		this.setUnlocalizedName("MHO"+name);
		this.setTextureName(name);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }
}
