package appeng.api.implementations;

import net.minecraftforge.common.ForgeDirection;
import appeng.api.storage.IStorageMonitorable;

/**
 * Implemented on inventories that can share their inventories with other networks, best example, ME Interface.
 */
public interface ITileStorageMonitorable
{

	IStorageMonitorable getMonitorable(ForgeDirection side);

}