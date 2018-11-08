import java.util.ArrayList;
import java.util.Arrays;

public class QuoteSwap {
    public static void main(String... args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."

    }

    public static String quoteSwap(ArrayList<String> list) {
        int indexOf1 = list.indexOf("do");
        int indexOf2 = list.indexOf("cannot");
        String temp = list.get(indexOf1);
        list.set(indexOf1, "cannot");
        list.set(indexOf2, temp);

        String s = "";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i) + " ");
            if (i == list.size() - 1) {
                sb.append(list.get(i));
            }
        }
        s = sb.toString();

        return s;
    }

}
