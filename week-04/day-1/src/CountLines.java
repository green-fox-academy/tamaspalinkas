import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CountLines {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.
    public static void main(String[] args) {
        String fileName = "my-file.txt";
        System.out.println(numberOfLines(fileName));
    }

    public static int numberOfLines(String fileName) {
        int lineCount = 0;
        Path path = Paths.get(fileName);

        try {
            List<String> lines = Files.readAllLines(path);
            for (String s : lines) {
                lineCount++;
            }
            return lineCount;
        } catch (IOException e) {
            return 0;
        }
    }
}
