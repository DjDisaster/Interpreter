package interpreter.dainterpreter.Events;

import org.bukkit.event.Event;

import java.util.ArrayList;
import java.util.HashMap;

public class Register {
    public static HashMap<String, Event> events = new HashMap<String, Event>();
    public static void register(Event event, String syntax) {
        events.put(syntax, event);
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

