package mho.core.common;

public class TeleportInformation
{
	public String name;
	public int x;
	public int y;
	public int z;
	public boolean activate;
	
	public TeleportInformation(String name, boolean activate, int x, int y, int z)
	{
		this.name = name;
		this.x = x;
		this.y = y;
		this.z = z;
		this.activate = activate;
	}
}
