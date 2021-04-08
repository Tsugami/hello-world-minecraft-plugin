package me.asjown.com;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public void onEnable () {
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Oi Hello World");
	}
	
	public void onDisable () {
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Tchau Hello World");
	}
}