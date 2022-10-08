package interpreter.dainterpreter.Events;

import org.bukkit.event.Event;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent {
    public static void joinEvent() {
        // player join event
        Event event = new PlayerJoinEvent(null, null);
        Register.register(event, "On join:");
    }
}
