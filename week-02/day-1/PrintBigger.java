import java.util.Scanner;

public class PrintBigger {
    // Write a program that asks for two numbers and prints the bigger one

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();

        if (num_1 > num_2) {
            System.out.println(num_1);
        } else {
            System.out.println(num_2);
        }
    }
}
