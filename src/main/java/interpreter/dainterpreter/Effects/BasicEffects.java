package interpreter.dainterpreter.Effects;

import interpreter.dainterpreter.Main.Execute;

public class BasicEffects {
    public static void AddSyntax() {
        AddSyntax("%variable%++", "AddOne");
        AddSyntax("%variable% = %object%", "Set");
    }
    public static void AddSyntax(String syntax, String thing) {
        Execute.effects.put(syntax, thing);
    }
}
