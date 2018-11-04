import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    //Create a function named is anagram following your current language's style guide.
    //It should take two strings and return a boolean value depending on whether its an anagram or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        System.out.println(anagram(input1, input2));
    }

    public static boolean anagram(String input1, String input2) {
        if (input1.length() != input2.length()) {
            return false;
        } else {
            char[] inputArray1 = sort(input1);
            char[] inputArray2 = sort(input2);
            if (Arrays.equals(inputArray1, inputArray2)) {
                return true;
            } else {
                return false;
            }


        }
    }

    public static char[] sort(String input) {
        char[] inputArr = input.toCharArray();
        int n = inputArr.length;
        char temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (inputArr[j - 1] > inputArr[j]) {
                    temp = inputArr[j - 1];
                    inputArr[j - 1] = inputArr[j];
                    inputArr[j] = temp;
                }
            }
        }
        return inputArr;
    }
}