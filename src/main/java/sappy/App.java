package sappy;

import org.bukkit.plugin.java.JavaPlugin;

import sappy.listeners.*;

public class App extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Listening ");
        getServer().getPluginManager().registerEvents(new ItemSpawnListener(), this);
    }
    @Override
    public void onDisable() {
        getLogger().info("See you again, SpigotMC!");
    }
}
