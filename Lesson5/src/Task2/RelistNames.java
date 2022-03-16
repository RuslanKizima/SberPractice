package Task2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class RelistNames {

    public static void main(String[] args) throws IOException {
        String str;
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("Lesson5/src/Task2/listNames.txt"))) {
            str = reader.readLine();
        }

        String[] names = str.split(", ");
        Arrays.sort(names);
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("Lesson5/src/Task2/relistNames.txt"))) {
            for (String name : names) {
                writer.write(name + '\n');
            }
        }
    }
}
