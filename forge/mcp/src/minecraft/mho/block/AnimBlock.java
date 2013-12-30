package mho.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mho.common.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class AnimBlock extends Block 
{

	public AnimBlock(int par1, int par2, Material par3Material, String Name)
    {
        super(par1, par3Material);
		this.setCreativeTab(Mho.tabMhoBlocks);
		setStepSound(Block.soundStoneFootstep);
		GameRegistry.registerBlock(this, Name);
		LanguageRegistry.addName(this, Name);
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
