package interpreter.dainterpreter.Events;

import interpreter.dainterpreter.Main.EventRegister;
import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.bukkit.event.Listener;

import java.util.HashMap;


public class Register implements Listener{
    public static HashMap<String, Event> events = new HashMap<String, Event>();
    public static void register(Event thisevent, String syntax) {
        events.put(syntax, thisevent);
        Bukkit.broadcastMessage("Registered event " + thisevent.getEventName() + " with syntax " + syntax);
        EventRegister.registerEvent(thisevent, syntax);
    }

    public static void LoadEvents() {
        JoinEvent.joinEvent();
    }

    public static Boolean compareSyntax(String s) {
        // compare syntax to events
        for (String key : events.keySet()) {
            if (key.equals(s)) {
                return true;
            }
        }
        return false;
    }
    // compare syntax to event

}

