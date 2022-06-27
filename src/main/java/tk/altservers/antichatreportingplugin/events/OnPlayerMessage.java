package tk.altservers.antichatreportingplugin.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin; 
import org.bukkit.Bukkit;

public class OnPlayerMessage implements Listener {
    @EventHandler
    public void onPlayerChat(PlayerChatEvent event, JavaPlugin plugin) 
    {
      // stop the server from sending the message
      event.setCancelled(true);
      String msg = event.getMessage();
      String p = event.getPlayer().getDisplayName();
      String newmsg = "<"+p+"> "+msg;
      Bukkit.broadcastMessage(newmsg);
     }
     
     }

