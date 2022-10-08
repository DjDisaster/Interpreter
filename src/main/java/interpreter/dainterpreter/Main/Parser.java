package interpreter.dainterpreter.Main;

import interpreter.dainterpreter.Events.CheckEvent;
import interpreter.dainterpreter.Events.Register;
import org.bukkit.Bukkit;
import org.bukkit.event.player.PlayerJoinEvent;
import org.checkerframework.checker.units.qual.A;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Parser {
    public static void Parse(String file) throws IOException {
        String[] result = ReadFile.readFile(file);
        Bukkit.broadcastMessage("Parsing " + file);
        ArrayList lines = new ArrayList();
        String event = "";
        for (int i = 0; i < result.length; i++) {
            int indentation = result[i].length() - result[i].replace("\t", "").length();
            result[i] = result[i].replace("\t", "");
            // add result[i] to a list

            if (indentation == 0) {
                // if event != ""
                if (!event.equals("")) {
                    CheckEvent.checkEvent(event, lines);
                    event = "";
                }
                event = result[i];
                Bukkit.broadcastMessage("Event: " + event);
            } else {
                lines.add(result[i]);
            }
        }
        CheckEvent.checkEvent(event, lines);
    }
}
