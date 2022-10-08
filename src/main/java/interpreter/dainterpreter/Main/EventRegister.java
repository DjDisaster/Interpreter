package interpreter.dainterpreter.Main;

import interpreter.dainterpreter.DaInterpreter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.*;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.EventExecutor;

import java.util.ArrayList;
import java.util.HashMap;

public class EventRegister implements Listener {
    public static void registerEvent(Event thisevent, String syntax, ArrayList ray) {
        Bukkit.getPluginManager().registerEvent(thisevent.getClass(), new EventRegister(), EventPriority.NORMAL, new EventExecutor() {
            @Override
            public void execute(Listener listener, Event event) throws EventException {
                HashMap<String, String> localvar = new HashMap<String, String>();
                Bukkit.broadcastMessage("Event " + thisevent.getEventName() + " called with syntax " + syntax);
                PlayerJoinEvent e = (PlayerJoinEvent) event;
                Player player = e.getPlayer();
                Bukkit.broadcastMessage("Ray: " + ray.toString());
            }
        }, DaInterpreter.getPlugin(DaInterpreter.class));
    }
}