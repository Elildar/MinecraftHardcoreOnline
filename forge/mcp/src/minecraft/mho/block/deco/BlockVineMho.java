package mho.block.deco;

import mho.Mho;
import net.minecraft.block.BlockVine;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockVineMho extends BlockVine
{
    public BlockVineMho(int par1, String name)
    {
        super(par1);
        this.setTickRandomly(true);
        this.setHardness(0.2F);
        this.setStepSound(soundGrassFootstep);
		this.setCreativeTab(Mho.tabMhoDecorations);
		this.setUnlocalizedName("MHO"+name);
		this.setTextureName(name);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
             this.blockIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }
}
