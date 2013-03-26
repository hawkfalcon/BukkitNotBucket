package com.hawkfalcon.bnb;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{

	public void onEnable(){
		getServer().getPluginManager().registerEvents(this, this);
	}
	public void onDisable(){}


	@EventHandler
	public void chat(AsyncPlayerChatEvent event) {
		String message = event.getMessage();
		if (message.toLowerCase().contains("bucket")){
			event.setMessage(message.replace("bucket", "Bukkit"));
		}
	}
}



