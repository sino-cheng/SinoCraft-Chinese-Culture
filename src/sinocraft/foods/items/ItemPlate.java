package sinocraft.foods.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemPlate extends Item
{
	public ItemPlate(int Id)
	{
		super(Id);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister i)
	{
		itemIcon = i.registerIcon("SinoCraft:ItemPlate");
	}
}
