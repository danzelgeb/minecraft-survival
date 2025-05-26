package dev.danzel.smp.listener;

import dev.danzel.smp.Data;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandSendEvent;

public class PlayerCommandSendListener implements Listener {
    @EventHandler
    public void onCommand(PlayerCommandSendEvent event) {
        if (!event.getPlayer().isOp()) {
            event.getCommands().removeAll(Data.getHide());
        }
    }
}
