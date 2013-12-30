package mho.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.ClientProxy;
import mho.common.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Enseigne extends BlockDirectional {
	
	private Icon topIcon;
	
	public Enseigne(int par1, int texture, String Name) {
		super(par1, Material.wood);
		setCreativeTab(Mho.tabMhoEnseigne);
		GameRegistry.registerBlock(this);
		LanguageRegistry.addName(this, Name);
	}
	
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        int var5 = getDirection(par1IBlockAccess.getBlockMetadata(par2, par3, par4));
        
        if (var5 != 2 && var5 != 0)
        {
            this.setBlockBounds(0.375F, 0.0F, 0.0F, 0.625F, 1.0F, 1.0F);
        }
        else
        {
            this.setBlockBounds(0.0F, 0.0F, 0.375F, 1.0F, 1.0F, 0.625F);
        }
    }

	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving, ItemStack par6ItemStack)
    {
        int var6 = (MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) % 4;
		
		//fin du setblock a 4 ?
		
		System.out.println("Var6 = " + var6);
		
        par1World.setBlockMetadataWithNotify(par2, par3, par4, var6, 4);
    }
	
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        return true;
    }
	
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
       
    }
	
	public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }
	
    @SideOnly(Side.CLIENT)

    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates.  Args: blockAccess, x, y, z, side
     */
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
             this.topIcon = iconRegister.registerIcon(Mho.modid + ":" + "enseigneTop");
             this.blockIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName()+"Face");
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int side, int meta)
    {
    	if (meta == 0 || meta == 2) {
	    	if (side == 2 || side == 3) {
	    		return blockIcon;
	    	}
	    	else {
	    		return topIcon;
	    	}
    	}
    	else {
    		if (side == 5 || side == 4) {
	    		return blockIcon;
	    	}
	    	else {
	    		return topIcon;
	    	}
    	}
    }
}
