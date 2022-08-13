package nl.venetiushosting.festive.commands;

import nl.venetiushosting.festive.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

public class BaseCommand implements CommandExecutor {

    private final Main plugin;

    public BaseCommand(Main plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(args.length > 0){
                if(Objects.equals(args[0], "reload")) {
                    ReloadCommand reloadCommand = new ReloadCommand(plugin);
                    reloadCommand.reload();
                }
            }else{
                //open menu
                player.sendMessage("Menu open");
            }

        } else {
            System.out.println("You need to be a player to use this command");
        }

        return false;
    }
}
