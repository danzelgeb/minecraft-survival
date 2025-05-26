package dev.danzel.smp.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandAlias("debug")
@CommandPermission("smp.debug")
public class DebugCommand extends BaseCommand {

    @Default
    public void onDefault(CommandSender sender) {
        sender.sendMessage("/debug spawn - teleport to spawn");
    }

    @Subcommand("spawn")
    public void onSpawn(CommandSender sender) {
        if (sender instanceof Player player) {
            player.teleport(player.getWorld().getSpawnLocation());
            player.sendMessage("Teleported to spawn!");
        } else {
            sender.sendMessage("This command can only be used by players.");
        }
    }
}
