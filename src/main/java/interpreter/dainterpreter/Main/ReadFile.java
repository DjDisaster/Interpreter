package interpreter.dainterpreter.Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadFile {
    public static String[] readFile(String file) throws IOException {
        // read the file
        // return array of lines
        // get file
        File folder = new File("plugins/DaInterpreter/Scripts");
        File[] listOfFiles = folder.listFiles();
        String[] files = new String[0];
        // make array
        ArrayList validFiles = new ArrayList();
        for (File file1 : listOfFiles) {
            if (file1.isFile()) {
                if (file1.getName().endsWith(".da")) {
                    if (!file1.getName().startsWith("-")) {
                        // check for error
                        if (Files.exists(file1.toPath())) {
                            files = new String[files.length + 1];
                            files[files.length - 1] = file1.getName();
                            // add file to array
                            validFiles.add(file1.getName());

                        }
                    }
                }
            }
        }
        // convert arraylist to array
        String[] validFilesArray = new String[validFiles.size()];
        validFilesArray = (String[]) validFiles.toArray(validFilesArray);
        // get file
        String fileName = file;
        String filePath = "plugins/DaInterpreter/Scripts/" + fileName;
        Path path = Paths.get(filePath);
        // read file
        String[] lines = new String[0];
    try {
            lines = Files.readAllLines(path).toArray(new String[0]);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
