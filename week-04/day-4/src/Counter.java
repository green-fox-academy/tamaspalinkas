import java.util.Scanner;

public class Counter {
    // Write a recursive function that takes one parameter: n and counts down from n.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();

        System.out.println(countDown(n));
    }

    public static int countDown(int n) {
        if (n == 0) {
            return 0;
        }
        System.out.println(n);
        return countDown(n - 1);
    }

}
