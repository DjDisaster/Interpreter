package interpreter.dainterpreter.Main;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Objects;

public class GetValidFiles {
    public static String[] getValidFiles() {
        // get all files in Scripts folder
        // return array of valid files
        File folder = new File("plugins/DaInterpreter/Scripts");
        File[] listOfFiles = folder.listFiles();
        String[] files = new String[0];
        // make array
        ArrayList validFiles = new ArrayList();
        for (File file : Objects.requireNonNull(listOfFiles)) {
            if (file.isFile()) {
                if (file.getName().endsWith(".da")) {
                    if (!file.getName().startsWith("-")) {
                        // check for error
                        if (Files.exists(file.toPath())) {
                            files = new String[files.length + 1];
                            files[files.length - 1] = file.getName();
                            // add file to array
                            validFiles.add(file.getName());

                        }
                    }
                }
            }
        }
        // convert arraylist to array
        String[] validFilesArray = new String[validFiles.size()];
        validFilesArray = (String[]) validFiles.toArray(validFilesArray);
        return validFilesArray;
    }
}
