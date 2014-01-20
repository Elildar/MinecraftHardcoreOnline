package mho.block.generic;

import java.util.Random;

import net.minecraft.block.material.Material;

public class BlockStoneMho extends BlockMho {

	private int idDropped;
	
	public BlockStoneMho(int ID, Material par2Material, String name, int idDropped) {
		super(ID, par2Material, name);
		this.idDropped = idDropped;
	}

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.idDropped;
    }

}
