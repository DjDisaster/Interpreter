package interpreter.dainterpreter.Events;

import org.bukkit.event.Event;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent {
    public static void joinEvent() {
        // player join event
        Register.register(new PlayerJoinEvent(null, "yo"), "player join");
        //Register.register(event, "On join:");
    }
}
