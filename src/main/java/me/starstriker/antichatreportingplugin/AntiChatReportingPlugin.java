package me.starstriker.antichatreportingplugin;

import org.bukkit.plugin.java.JavaPlugin;
import me.starstriker.antichatreportingplugin.events.*;

public final class AntiChatReportingPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("chat reporting is being disabled");
        getServer().getPluginManager().registerEvents(new OnPlayerMessage(), this); 
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin has stopped, if this was intentional please disregard this message, if it crashed please contact the developer!");

    }

    
}
