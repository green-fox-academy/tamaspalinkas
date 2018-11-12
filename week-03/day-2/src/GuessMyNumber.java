import java.util.Scanner;

public class GuessMyNumber {
    //Write a program where the program chooses a number between 1 and 100. The player is then asked to enter a guess.
    //If the player guesses wrong, then the program gives feedback and ask to enter an other guess until the guess is correct.
    //
    //Make the range customizable (ask for it before starting the guessing).
    //You can add lives. (optional)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please specify a range in \"min max\" format");
        int min = sc.nextInt();
        int max = sc.nextInt();

        int randomNumber = (int) (Math.random() * (max - min) + min);
        System.out.println("Please choose a number between " + min + " and " + max);
        int userNum = sc.nextInt();
        int lives = 10;

        while (userNum != randomNumber && lives > 0) {
            lives--;
            if (userNum > randomNumber) {
                System.out.println("Too high. Please choose again. " + "Lives remaining: " + lives);
                userNum = sc.nextInt();
            } else {
                System.out.println("Too low. Please choose again. " + "Lives remaining: " + lives);
                userNum = sc.nextInt();
            }

        }
        if (userNum == randomNumber) {
            System.out.println("Correct!");
        }
        if (lives == 0) {
            System.out.println("You are out of lives.");
        }
    }
}
