package interpreter.dainterpreter.Main;

import interpreter.dainterpreter.Events.Register;
import org.bukkit.Bukkit;

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

            Boolean error = Register.compareSyntax(result[i]);
            // if error = false
            if (!error) {
                Bukkit.broadcastMessage("Error on line " + i + " in " + file);
                Bukkit.broadcastMessage("Syntax error: " + result[i]);
            }

        }
    }
}
