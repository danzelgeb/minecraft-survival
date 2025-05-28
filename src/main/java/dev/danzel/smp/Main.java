package dev.danzel.smp;

import co.aikar.commands.PaperCommandManager;
import dev.danzel.smp.commands.DebugCommand;
import dev.danzel.smp.commands.WhereAmICommand;
import dev.danzel.smp.listener.PlayerCommandPreprocessListener;
import dev.danzel.smp.listener.PlayerCommandSendListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        PaperCommandManager commandManager = new PaperCommandManager(this);

        commandManager.registerCommand(new DebugCommand());
        commandManager.registerCommand(new WhereAmICommand());

        getServer().getPluginManager().registerEvents(new PlayerCommandPreprocessListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerCommandSendListener(), this);
    }
}
