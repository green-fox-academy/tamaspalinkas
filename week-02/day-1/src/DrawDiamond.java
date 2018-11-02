import java.util.Scanner;

public class DrawDiamond {
    // Write a program that reads a number from the standard input, then draws a
    // diamond like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //  *****
    //   ***
    //    *
    //
    // The diamond should have as many lines as the number was
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();

        for (int i = 0; i < lines; i++) {
            if (i < lines / 2) {
                for (int j = lines / 2; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i * 2; k++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 0; k < i - lines / 2; k++) {
                    System.out.print(" ");
                }
                for (int l = lines; l > i; l--) {
                    System.out.print("*");
                }
                for (int m = lines; m > i + 1; m--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
