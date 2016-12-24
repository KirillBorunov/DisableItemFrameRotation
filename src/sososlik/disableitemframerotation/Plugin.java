package sososlik.disableitemframerotation;

import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin 
{

    @Override
    public void onEnable() {
    	getServer().getPluginManager().registerEvents(new EventListener(), this);
    }
	
}
