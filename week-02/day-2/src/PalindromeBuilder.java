import java.util.Scanner;

public class PalindromeBuilder {
    //Create a function named create palindrome following your current language's style guide.
    //It should take a string, create a palindrome from it and then return it.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        System.out.println(palindrome(input1));
    }

    public static String palindrome(String input) {
        //create an inverse string
        String inverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            inverse += input.charAt(i);
        }
        return input + inverse;
    }
}
