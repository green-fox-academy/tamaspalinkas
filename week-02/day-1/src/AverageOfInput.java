import java.util.Scanner;

public class AverageOfInput {
    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums [] = new int[5];
        int sum = 0;

        for (int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
            sum += nums[i];
        }
        double avg = sum/nums.length;
        System.out.println("Sum : " + sum + " Average : " + avg);

    }
}
