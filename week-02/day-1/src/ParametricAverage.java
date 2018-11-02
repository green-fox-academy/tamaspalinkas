import java.util.Scanner;

public class ParametricAverage {
    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < num; i++) {
            int scan = sc.nextInt();
            sum += scan;
        }

        double avg = (double) sum / num;

        System.out.println("Sum: " + sum + ", Average : " + avg);
    }
}
