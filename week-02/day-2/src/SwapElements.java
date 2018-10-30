public class SwapElements {
    // - Create an array variable named `abc`
    //   with the following content: `["first", "second", "third"]`
    // - Swap the first and the third element of `abc`
    public static String[] swapElements(String[] arr) {
        String temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;

        return arr;
    }
    public static void main(String[] args) {
        String[] abc = {"first", "second", "third"};
        String[] solution = swapElements(abc);

//        for (int i=0; i<abc.length; i++) {
//            System.out.println(abc[i]);
//        }
    }
}
