import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class EncodedLines {
    public static void main(String[] args) {
        String p = "encoded-lines.txt";
        System.out.println(decode(p));
    }

    public static List<String> decode(String p) {
        Path path = Paths.get(p);

        try {

            List<String> lines = Files.readAllLines(path);
            List<String> solution = new ArrayList<>();

            for (String line : lines) {
                StringBuilder sb = new StringBuilder(line);
                for (int i = 0; i < line.length(); i++) {
                    int ascii = (int) line.charAt(i);
                    if (ascii > 32) {
                        sb.setCharAt(i, (char) (ascii - 1));
                    }
                }
                solution.add(sb.toString());
            }
            return solution;

        } catch (IOException e) {
            System.out.println(e);
        }
        return null;
    }

}
