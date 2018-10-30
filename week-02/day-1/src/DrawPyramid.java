import java.util.Scanner;

public class DrawPyramid {
    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int num = sc.nextInt();

        for (int i=0; i<num; i++) {
            for (int j=num; j>i; j--) {
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++) {
                System.out.print("*");
            }
            for (int l=0; l<i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
