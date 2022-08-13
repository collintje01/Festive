package nl.venetiushosting.festive.commands;

import nl.venetiushosting.festive.Main;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ReloadCommand {

    private final Main plugin;
    public ReloadCommand(Main plugin) {
        this.plugin = plugin;
    }
    public void reload() {
        Bukkit.getServer().getPluginManager().disablePlugin(plugin);
        Bukkit.getServer().getPluginManager().enablePlugin(plugin);
    }
}
