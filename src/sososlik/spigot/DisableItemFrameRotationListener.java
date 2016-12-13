package sososlik.spigot;

import org.bukkit.entity.ItemFrame;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class DisableItemFrameRotationListener implements Listener 
{

	@EventHandler
    public void onPlayerInteractEntity(PlayerInteractEntityEvent event)
    {
		if(event.isCancelled() || event.getPlayer().isOp())
		{
			return;
		}

		if(event.getRightClicked() instanceof ItemFrame)
		{
			event.setCancelled(true);
		}
		
    }
	
}
