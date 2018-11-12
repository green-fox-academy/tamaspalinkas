import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful
    public static void main(String[] args) {
        System.out.println(copy("my-file.txt", "copiedTo.txt"));
    }
    public static boolean copy(String copyFrom, String copyTo) {
        Path pathFrom = Paths.get(copyFrom);
        Path pathTo = Paths.get(copyTo);
        try {
            List<String> contentFrom = Files.readAllLines(pathFrom);
            Files.write(pathTo, contentFrom);
            return true;
            } catch (IOException e) {
            return false;
        }
    }
}
