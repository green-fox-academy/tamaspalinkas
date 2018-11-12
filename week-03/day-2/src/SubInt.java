import java.util.ArrayList;
import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        //  Example:
        System.out.println(subInt(1, new int[]{1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[]{1, 11, 34, 52, 61}));
        //  should print: '[]'
        System.out.println(subInt(333, new int[]{33321, 13331, 33436, 5362, 3661, 94, 50, 27777, 2778, 27, 223332}));
    }

    public static ArrayList<Integer> subInt(int element, int[] arr) {
        ArrayList<Integer> indexArr = new ArrayList<>();
        int offset = 1;
        final int elmnt = element;

        while (element != 0) {
            element /= 10;
            offset *= 10;
        }
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != 0) {
                if (arr[i] % offset == elmnt) {
                    indexArr.add(i);
                    arr[i] = 0;
                } else {
                    arr[i] /= 10;
                }
            }
        }
        return indexArr;
    }
}