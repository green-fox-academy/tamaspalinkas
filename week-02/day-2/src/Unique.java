import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        System.out.println(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
    }

    public static String unique(int[] arr) {
        int[] inputArray = arr;
        int[] uniqueArray = new int[uniqueElements(inputArray)];
        return Arrays.toString(fillUniqueArray(inputArray, uniqueArray));
    }

    public static int uniqueElements(int[] arr) {
        int duplicate = 0;
        int total = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate++;
                }
            }
        }
        return total - duplicate;
    }

    public static int[] fillUniqueArray(int[] inputArray, int[] uniqueArray) {
        int count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < count; j++) {
                if (uniqueArray[j] == inputArray[i]) {
                    duplicate = true;
                }

            }
            if (!duplicate) {
                uniqueArray[count++] = inputArray[i];
            }

        }
        return uniqueArray;
    }
    
}