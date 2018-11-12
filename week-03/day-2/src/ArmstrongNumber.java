import java.util.Scanner;

public class ArmstrongNumber {
    //Write a simple program to check if a given number is an armstrong number.
    //The program should ask for a number. E.g. if we type 371, the program should print out: The 371 is an Armstrong number.
    //
    //An Armstrong number is an n-digit number that is equal to the sum of the nth powers of its digits.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();
        armstrongNumber(num);
    }

    public static void armstrongNumber(int n) {
        int digits = 0;
        final int num = n;

        while (n > 0) {
            n /= 10;
            digits++;
        }
        int sum = 0;

        for (int i = 10, j = 10; i <= (int) Math.pow(10, digits); i *= 10) {
            if (i == 10) {
                int dig = num % 10;
                dig = (int) Math.pow(dig, digits);
                sum += dig;
            } else {
                int dig = (num % i) / j;
                dig = (int) (Math.pow(dig, digits));
                j *= 10;
                sum += dig;
            }
        }
        if (sum == num) {
            System.out.println("The " + num + " is an Armstrong number.");
        } else {
            System.out.println("The " + num + " is not an Armstrong number.");
        }
    }
}
