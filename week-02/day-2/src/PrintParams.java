public class PrintParams {
    // - Create a function called `printParams`
    //   which prints the input String parameters
    // - It can have any number of parameters

    // Examples
    // printParams("first")
    // printParams("first", "second")
    // printParams("first", "second", "third", "fourh")
    // ...
    public static void printParams(String... values) {
        for (String s:values) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        printParams("first");
        printParams("first", "second");
        printParams("first", "second", "third", "fourh");
    }
}
