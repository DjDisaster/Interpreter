package interpreter.dainterpreter.Events;

import org.bukkit.Bukkit;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class BasicEvents {
    public static void joinEvent() {
        CheckEvent.Events.put("On Join:", new PlayerJoinEvent(null, "yo"));
        CheckEvent.Events.put("On Left Click:", new PlayerInteractEvent(null, Action.LEFT_CLICK_AIR, null, null, null));
        CheckEvent.Events.put("On Right Click:", new PlayerInteractEvent(null, Action.RIGHT_CLICK_AIR, null, null, null));
    }
}
