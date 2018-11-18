import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lottery {

    public static void main(String[] args) {
        // Create a method that find the 5 most common lottery numbers in lottery.csv
        String p = "lottery.csv";
        System.out.println(Arrays.toString(commonNumbers(getNumbers(p))));

    }

    public static ArrayList<Integer> getNumbers(String p) {
        Path path = Paths.get(p);
        ArrayList<Integer> lotteryNumbers = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                String[] lineSplit = line.split(";");

                for (int i = 11; i < 16; i++) {
                    lotteryNumbers.add(Integer.parseInt(lineSplit[i]));
                }
            }
            return lotteryNumbers;

        } catch (IOException e) {
            System.out.println(e);
        }
        return lotteryNumbers;
    }

    public static int[] commonNumbers(ArrayList<Integer> arrayList) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arrayList.size(); i++) {
            int key = arrayList.get(i);
            if (map.containsKey(key)) {
                int freq = map.get(key);
                freq++;
                map.put(key, freq);
            } else {
                map.put(key, 1);
            }
        }
        int[] maxValues = new int[5];

        for (int i = 0; i < 5; i++) {
            int maxCount = 0, res = -1;
            for (Map.Entry<Integer, Integer> val : map.entrySet()) {
                if (maxCount < val.getValue()) {
                    res = val.getKey();
                    maxCount = val.getValue();
                }
            }
            maxValues[i] = res;
            map.remove(res);
        }
        return maxValues;
    }
}