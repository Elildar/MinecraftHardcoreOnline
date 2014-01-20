package mho.block.generic;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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
	
	@SideOnly(Side.CLIENT)
    public String getTextureFile()
    {
		return "/terrain.png";
    }
}
