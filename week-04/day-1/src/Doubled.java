import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        decrypt("duplicated-chars.txt");
    }

    public static void decrypt(String p) {
        Path path = Paths.get(p);
        try {
            List<String> lines = Files.readAllLines(path);
            String cleaned = "";
            for (int i = 0; i < lines.size(); i++) {
                for (int j = 0; j < lines.get(i).length(); j += 2) {
                    cleaned += lines.get(i).charAt(j);
                }
                cleaned += " ";
            }
            System.out.println(cleaned);
        } catch (IOException e) {
            System.out.println("Unable to read file");
        }

    }
}
