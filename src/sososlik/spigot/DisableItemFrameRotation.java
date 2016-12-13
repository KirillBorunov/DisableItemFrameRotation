package sososlik.spigot;

import org.bukkit.plugin.java.JavaPlugin;

public class DisableItemFrameRotation extends JavaPlugin 
{

    @Override
    public void onEnable() {
    	getServer().getPluginManager().registerEvents(new DisableItemFrameRotationListener(), this);
    }
	
}
