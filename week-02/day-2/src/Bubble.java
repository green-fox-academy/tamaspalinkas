import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `true` sort that list descending

        //  Example:
        System.out.println(bubble(new int[]{34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
        System.out.println(advancedBubble(new int[]{34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]
    }

    public static String bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = 0;
                    tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return Arrays.toString(arr);
    }

    public static String advancedBubble(int[] arr, boolean indicator) {
        if (!indicator) {
            bubble(arr);
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = arr.length - 1; j > i; j--) {
                    if (arr[j] > arr[j - 1]) {
                        int tmp = 0;
                        tmp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = tmp;
                    }
                }
            }
        }
        return Arrays.toString(arr);
    }
}
