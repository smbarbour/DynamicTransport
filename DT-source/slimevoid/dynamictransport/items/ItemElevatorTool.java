package slimevoid.dynamictransport.items;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import slimevoid.dynamictransport.core.lib.BlockLib;
import slimevoid.dynamictransport.core.lib.ConfigurationLib;

public class ItemElevatorTool extends Item {

	public ItemElevatorTool(int par1) {
		super(par1);
		this.maxStackSize = 1;
	}

	public boolean isItemTool(ItemStack par1ItemStack) {
		return true;
	}

	@Override
	public EnumRarity getRarity(ItemStack ist) {
		return EnumRarity.rare;
	}

	@Override
	public boolean getShareTag() {
		return true;
	}

	@Override
	public boolean shouldPassSneakingClickToBlock(World world, int x, int y, int z) {
		return world.getBlockId(x,
								y,
								z) == ConfigurationLib.blockTransportBaseID
				&& (world.getBlockMetadata(	x,
											y,
											z) == BlockLib.BLOCK_ELEVATOR_COMPUTER_ID);
	}

}