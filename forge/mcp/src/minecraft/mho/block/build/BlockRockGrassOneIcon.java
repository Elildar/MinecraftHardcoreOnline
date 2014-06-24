package mho.block.build;

import mho.Mho;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class BlockRockGrassOneIcon extends BlockRockGrass {

	public BlockRockGrassOneIcon(int par1, String name) {
		super(par1, name);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }
	
	public Icon getIcon(int side, int meta) {
		return this.blockIcon;
	}
}
