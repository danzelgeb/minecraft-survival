package dev.danzel.smp;

import dev.danzel.smp.listener.PlayerCommandPreprocessListener;
import dev.danzel.smp.listener.PlayerCommandSendListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerCommandPreprocessListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerCommandSendListener(), this);
    }
}
