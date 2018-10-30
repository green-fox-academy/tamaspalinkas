import java.util.Scanner;

public class Factorio {
    // - Create a function called `factorio`
    //   that returns it's input's factorial
    public static int factorio(int num) {
        int factorial = 1;
        for (int i=1; i<=num; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int num = sc.nextInt();

        System.out.println(factorio(num));
    }
}
