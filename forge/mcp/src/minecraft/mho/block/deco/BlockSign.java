package mho.block.deco;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSign extends Block {

	private Icon topIcon;
	
	public BlockSign(int ID, String name) {
		super(ID, Material.wood);
		setCreativeTab(Mho.tabMhoDecorations);
		setUnlocalizedName("MHO"+name);
		setTextureName(name);
	}

    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
	public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z)
    {
        int meta = world.getBlockMetadata(x, y, z);

        if (meta == 0)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
        }

        if (meta == 1)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
        }

        if (meta == 2)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
        }

        if (meta == 3)
        {
            this.setBlockBounds(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }

        if (meta == 4 || meta == 6)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.375F, 1.0F, 1.0F, 0.625F);
        }
        if (meta == 5 || meta == 7)
        {
            this.setBlockBounds(0.375F, 0.0F, 0.0F, 0.625F, 1.0F, 1.0F);
        }
    }

    /**
     * Sets the block's bounds for rendering it as an item
     */
    public void setBlockBoundsForItemRender()
    {
        this.setBlockBounds(0.0F, 0.0F, 0.375F, 1.0F, 1.0F, 0.625F);
    }

    /**
     * Called when the block is placed in the world.
     */
	public void onBlockPlacedBy(World par1World, int x, int y, int z, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
    {
        int meta = (MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) % 4;

        boolean flag = true;
        
        if (meta == 0 && par1World.getBlockMaterial(x, y, z + 1).isSolid())
        {
            this.setBlockBounds(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
            flag = false;
        }

        if (meta == 1 && par1World.getBlockMaterial(x - 1, y, z).isSolid())
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
            flag = false;
        }

        if (meta == 2 && par1World.getBlockMaterial(x, y, z - 1).isSolid())
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
            flag = false;
        }

        if (meta == 3 && par1World.getBlockMaterial(x + 1, y, z).isSolid())
        {
            this.setBlockBounds(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            flag = false;
        }

	    if (flag)
	    {
	    	meta += 4;
	    }

        if (meta == 4 || meta == 6)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.375F, 1.0F, 1.0F, 0.625F);
        }

        if (meta == 5 || meta == 7)
        {
            this.setBlockBounds(0.375F, 0.0F, 0.0F, 0.625F, 1.0F, 1.0F);
        }

        par1World.setBlockMetadataWithNotify(x, y, z, meta, 4);
    }

	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        return true;
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
	public void onNeighborBlockChange(World par1World, int x, int y, int z, int neighbor)
    {/*
        boolean flag = true;
        
        int meta = par1World.getBlockMetadata(x, y, z);

        if (meta == 0 && par1World.getBlockMaterial(x, y, z + 1).isSolid())
        {
            flag = false;
        }

        if (meta == 1 && par1World.getBlockMaterial(x - 1, y, z).isSolid())
        {
            flag = false;
        }

        if (meta == 2 && par1World.getBlockMaterial(x, y, z - 1).isSolid())
        {
            flag = false;
        }

        if (meta == 3 && par1World.getBlockMaterial(x + 1, y, z).isSolid())
        {
            flag = false;
        }

        if ((meta == 4 || meta == 5 || meta == 6 || meta == 7) && (par1World.getBlockMaterial(x, y + 1, z).isSolid() || par1World.getBlockMaterial(x, y - 1, z).isSolid()))
        {
            flag = false;
        }

	    if (flag)
	    {
	    	this.dropBlockAsItem(par1World, x, y, z, par1World.getBlockMetadata(x, y, z), 0);
	        par1World.setBlockToAir(x, y, z);
	    }*/
    }
	
    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return true;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
             this.topIcon = iconRegister.registerIcon(Mho.modid + ":" + "signTop");
             this.blockIcon = iconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int side, int meta)
    {
    	meta = meta % 4;
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
