import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        reverseOrder("reversed-order.txt");
    }

    public static void reverseOrder(String p) {
        Path path = Paths.get(p);
        List<String> lines = null;
        String reversed = " ";
        try {
            lines = Files.readAllLines(path);
            for (int i = lines.size() - 1; i >= 0; i--) {
                reversed += lines.get(i);
                reversed += " ";
            }
            System.out.println(reversed);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}