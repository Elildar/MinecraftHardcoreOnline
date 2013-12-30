package mho.common;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.tileentity.TileEntity;


public class TileEntityBanner extends TileEntity {

	//0-7 (on ground top)
	//8-15 (on ground base)
	//16-19 (on wall top)
	//20-24 (on wall base)
	private byte state;

	public TileEntityBanner(){
		state = 0;
	}

	public TileEntityBanner(byte state) {
		super();
		this.state = state;
	}

	public boolean isBase() {
		return state < 8 || (state>15 && state< 20);
	}

	public boolean isTop(){
		return !(isBase());
	}

	public boolean isOnGround(){
		return state < 16;
	}
	public boolean isOnWall(){
		return state > 15;
	}

	public int getState() {
		return state;
	}

	public void setState(byte state) {
		this.state = state;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbtTagCompound) {
		super.readFromNBT(nbtTagCompound);
		state = nbtTagCompound.getByte("state");
	}

	@Override
	public void writeToNBT(NBTTagCompound nbtTagCompound) {
		super.writeToNBT(nbtTagCompound);
		nbtTagCompound.setByte("state", state);
	}

	@Override
	public Packet getDescriptionPacket() {


		ByteArrayOutputStream bos = new ByteArrayOutputStream(14);
		DataOutputStream outputStream = new DataOutputStream(bos);
		try {

			outputStream.writeInt(xCoord);
			outputStream.writeInt(yCoord);
			outputStream.writeInt(zCoord);

			outputStream.writeByte(state);
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return null;

	}

}