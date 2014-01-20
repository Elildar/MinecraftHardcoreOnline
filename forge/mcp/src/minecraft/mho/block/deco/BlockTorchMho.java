package mho.block.deco;

import mho.Mho;
import net.minecraft.block.BlockTorch;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTorchMho extends BlockTorch
{
    public BlockTorchMho(int ID, String name)
    {
        super(ID);
        this.setLightValue(1.0F);
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
