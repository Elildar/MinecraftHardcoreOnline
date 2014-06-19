package mho.block.generic;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockAnim extends Block 
{

	public BlockAnim(int par1, Material par3Material, String name)
    {
        super(par1, par3Material);
		this.setCreativeTab(Mho.tabMhoBlocks);
		this.setStepSound(Block.soundStoneFootstep);
		this.setUnlocalizedName("MHO"+name);
		this.setTextureName(name);
    }
	
	/**public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity) {
		if (par5Entity instanceof EntityLiving) {
		((EntityLiving) par5Entity).addPotionEffect(new PotionEffect(Potion.confusion.getId(), 100, 1));
		}
	}**/

    public boolean isOpaqueCube()
    {
        return false;
    }

    public int getRenderType()
    {
        return 4;
    }

    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 1;
    }

	@SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        Material material = par1IBlockAccess.getBlockMaterial(par2, par3, par4);
        return material == this.blockMaterial ? false : (par5 == 1 ? true : (!par1IBlockAccess.isBlockOpaqueCube(par2, par3, par4) ? true : super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, par5)));
    }
	
	@SideOnly(Side.CLIENT)
    public String getTextureFile()
    {
		return "/terrain.png";
    }
}
