import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        reverseLines("reversed-lines.txt");
    }

    public static void reverseLines(String p) {
        Path path = Paths.get(p);
        String reversed = "";
        try {
            List<String> lines = Files.readAllLines(path);
            for (int i = 0; i < lines.size(); i++) {
                for (int j = lines.get(i).length() - 1; j >= 0; j--) {
                    reversed += lines.get(i).charAt(j);
                }
                reversed += " ";
            }
            System.out.println(reversed);
        } catch (IOException e) {
            System.out.println("Unable to read file");
        }

    }
}