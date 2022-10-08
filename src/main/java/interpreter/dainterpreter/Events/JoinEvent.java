package interpreter.dainterpreter.Events;

import org.bukkit.event.Event;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent {
    public static void joinEvent() {
        Register.register(new PlayerJoinEvent(null, "yo"), "player join");
    }
}
