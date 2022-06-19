package mc.nagol12344.spigotmc.plugin.noreport;

import mc.nagol12344.spigotmc.plugin.noreport.commands.*;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.metadata.MetadataValue;


public class TemplatePlugin extends JavaPlugin {

    public void onEnable() {
        this.getCommand("enrich").setExecutor(new EnrichCommand());
        getLogger().info("Added the 'enrich' command.");
    }

    public void onDisable() {
        getLogger().info("Plugin disabled.");
            }
    }