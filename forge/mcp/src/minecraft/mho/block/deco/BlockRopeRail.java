package mho.block.deco;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.ClientProxy;
import mho.Mho;
import net.minecraft.block.BlockRail;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;

public class BlockRopeRail extends BlockRail {

	public BlockRopeRail(int par1, String name) {
		super(par1);
		setCreativeTab(Mho.tabMhoDecorations);
		this.setUnlocalizedName("MHO"+name+"Rail");
		this.setTextureName(name);
	}

    public float getRailMaxSpeed(World world, EntityMinecart cart, int y, int x, int z)
    {
        return 0;
    }

    public boolean isFlexibleRail(World world, int y, int x, int z)
    {
        return false;
    }

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	    {
	        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
	    }
}
