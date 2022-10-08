package interpreter.dainterpreter.Main;

import interpreter.dainterpreter.DaInterpreter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.*;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.EventExecutor;

public class EventRegister implements Listener {
    public static void registerEvent(Event thisevent, String syntax) {
        Bukkit.getPluginManager().registerEvent(thisevent.getClass(), new EventRegister(), EventPriority.NORMAL, new EventExecutor() {
            @Override
            public void execute(Listener listener, Event event) throws EventException {
                Bukkit.broadcastMessage("Event " + thisevent.getEventName() + " called with syntax " + syntax);
                // get player

            }
        }, DaInterpreter.getPlugin(DaInterpreter.class));
    }

}