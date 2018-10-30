import java.util.Scanner;

public class Sum {
    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter and returns with an integer
    public static int sum(int num) {
        int sumOfNums = 0;
        for (int i=0; i<=num; i++) {
            sumOfNums += i;
        }
        return sumOfNums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int num = sc.nextInt();
        System.out.println(sum(num));

        }
    }
