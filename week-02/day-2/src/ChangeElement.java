public class ChangeElement {
    // - Create an array variable named `s`
    //   with the following content: `[1, 2, 3, 8, 5, 6]`
    // - Change the 8 to 4
    // - Print the fourth element
    public static void replaceIndexOf(int findIndexOf, int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == findIndexOf) {
                array[i] = 4;
            }
        }
    }
    public static void main(String[] args) {
        int[] s = {1, 2, 3, 8, 5, 6};
        int findIndexOf = 8;

        replaceIndexOf(findIndexOf, s);
        System.out.println(s[3]);

    }
}