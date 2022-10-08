package interpreter.dainterpreter.Main;

import interpreter.dainterpreter.Events.Register;
import org.bukkit.Bukkit;
import org.bukkit.event.player.PlayerJoinEvent;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Parser {
    public static void Parse(String file) throws IOException {
        String[] result = ReadFile.readFile(file);
        Bukkit.broadcastMessage("Parsing " + file);

        for (int i = 0; i < result.length; i++) {
            int indentation = result[i].length() - result[i].replace("\t", "").length();
            result[i] = result[i].replace("\t", "");
            // if indentation = 0 it is an event
            String event = ""
            if (indentation == 0) {
                if event
                event
            }
            //Boolean error = Register.compareSyntax(result[i]);
        }
    }
}
