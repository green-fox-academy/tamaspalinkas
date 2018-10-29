import java.util.Scanner;

public class GuessTheNumber {
    // Write a program that stores a number, and the user has to figure it out.
    // The user can input guesses, after each guess the program would tell one
    // of the following:
    //
    // The stored number is higher
    // The stored number is lower
    // You found the number: 8

    public static void main(String[] args) {
        int storedNum = 8;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number.");
        boolean answer = false;
        int guess = sc.nextInt();

        while (answer == false) {
            if (guess == storedNum) {
                System.out.println("You found the number: " + storedNum);
                answer = true;
            } else if (guess < storedNum) {
                System.out.println("The stored number is higher");
                System.out.println("Please enter a number.");
                guess = sc.nextInt();
            } else {
                System.out.println("The stored number is lower");
                System.out.println("Please enter a number.");
                guess = sc.nextInt();
            }

        }
    }
}