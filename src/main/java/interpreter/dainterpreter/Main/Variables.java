package interpreter.dainterpreter.Main;

import java.util.HashMap;

public class Variables {
    public static HashMap<String, String> variables = new HashMap<String, String>();
    public static void AddVariable(String name, String value) {
        variables.put(name, value);
    }
    public static String GetVariable(String name) {
        return variables.get(name);
    }
}
