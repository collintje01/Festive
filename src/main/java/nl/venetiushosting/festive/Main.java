package nl.venetiushosting.festive;

import nl.venetiushosting.festive.commands.BaseCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class Main extends JavaPlugin {

    private static Main plugin;
    @Override
    public void onEnable() {
        plugin = this;

        this.registerCommands();
        Bukkit.getServer().getLogger().info("Festive is now Enabled");
    }

    @Override
    public void onDisable() {
        Bukkit.getServer().getLogger().info("Festive is now Disabled.");
        plugin = null;
    }

    protected void registerCommands() {
        BaseCommand baseCommand = new BaseCommand(this);

        Objects.requireNonNull(getCommand("festive")).setExecutor(baseCommand);
    }
}
