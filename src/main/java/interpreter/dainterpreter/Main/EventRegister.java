package interpreter.dainterpreter.Main;

import interpreter.dainterpreter.DaInterpreter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.*;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.EventExecutor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventRegister implements Listener {
    // check for player join
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        String syntax = "On Join:";
        HashMap<String, String> localvar = new HashMap<String, String>();
        Player player = event.getPlayer();
        Bukkit.broadcastMessage("Parser" + Parser.Parsed.toString());
    }
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        // check if click type = left click
        String syntax = "";
        if (event.getAction() == Action.LEFT_CLICK_AIR) {
             syntax = "On Left Click:";
        } else if (event.getAction() == Action.RIGHT_CLICK_AIR) {
             syntax = "On Right Click:";
        }
        // get value of syntax from Parser.Parsed but ignore case
        // loop keys of Parser.Parsed
        ArrayList thiskey = new ArrayList();
        for (String key : Parser.Parsed.keySet()) {
            if (key.equalsIgnoreCase(syntax)) {
                thiskey = (ArrayList) Parser.Parsed.get(key);
                }
            }
        // loop through thiskey
        for (int i = 0; i < thiskey.size(); i++) {
            // log thiskey.get(i)
            Bukkit.broadcastMessage(thiskey.get(i).toString());
            }
        }

    }
