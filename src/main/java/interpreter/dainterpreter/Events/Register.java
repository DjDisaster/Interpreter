package interpreter.dainterpreter.Events;

import interpreter.dainterpreter.DaInterpreter;
import interpreter.dainterpreter.Main.EventRegister;
import jdk.javadoc.internal.tool.Main;
import org.bukkit.Bukkit;
import org.bukkit.event.*;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.EventExecutor;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.HashMap;

import static jdk.tools.jlink.internal.PluginRepository.getPlugin;
import static org.bukkit.Bukkit.getServer;
public class Register implements Listener{
    public static HashMap<String, Event> events = new HashMap<String, Event>();
    public static void register(Event thisevent, String syntax) {
        events.put(syntax, thisevent);
        Bukkit.broadcastMessage("Registered event " + thisevent.getEventName() + " with syntax " + syntax);
        // check when thisevent is called and broadcast the syntax
        EventRegister.registerEvent(thisevent, syntax);

    }

    public static void LoadEvents() {
        JoinEvent.joinEvent();
    }
    // compare syntax to event
    public static boolean compareSyntax(String syntax) {
        // loop through events
        for (String key : events.keySet()) {
            if (key.equals(syntax)) {
                events.get(key);
                return true;
            }
        }
        return false;
    }
}

