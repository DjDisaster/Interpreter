package interpreter.dainterpreter.Events;

import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent {
    public static void joinEvent() {
        CheckEvent.Events.put("On Join:", new PlayerJoinEvent(null, "yo"));
        // log events
        Bukkit.broadcastMessage("Event On Join: registered" + CheckEvent.Events.get("On Join:").toString());
    }
}
