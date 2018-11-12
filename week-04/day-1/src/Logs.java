import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.
    public static void main(String[] args) {
        System.out.println(getPostRatio("log.txt"));
        System.out.println(uniqueIPs("log.txt"));
    }

    public static double getPostRatio(String p) {
        Path path = Paths.get(p);
        int getCount = 0;
        int postCount = 0;
        try {
            List<String> lines = Files.readAllLines(path);
            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).contains("GET")) {
                    getCount++;
                }
                if (lines.get(i).contains("POST")) {
                    postCount++;
                }
            }
            return (double) getCount / postCount;

        } catch (IOException e) {

        }
        return 0;
    }

    public static ArrayList<String> uniqueIPs(String p) {
        Path path = Paths.get(p);
        ArrayList<String> ips = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(path);
            for (int i = 0; i < lines.size(); i++) {
                String[] s = (lines.get(i).split(" "));
                if (!ips.contains(s[8])) {
                    ips.add(s[8]);
                }
            }

        } catch (IOException e) {

        }
        return ips;
    }

}
