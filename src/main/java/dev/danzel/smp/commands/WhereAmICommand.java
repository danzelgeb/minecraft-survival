package dev.danzel.smp.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import dev.danzel.smp.Data;
import org.bukkit.entity.Player;

@CommandAlias("whereami|wheremi|where")
public class WhereAmICommand extends BaseCommand {

    @Default
    public void onDefault(Player player) {
        player.sendMessage(Data.text(
                "Du bist bei X: " + player.getLocation().getBlockX() +
                " Y: " + player.getLocation().getBlockY() +
                " Z: " + player.getLocation().getBlockZ() +
                " in der Welt: " + player.getWorld().getName()));
    }
}
