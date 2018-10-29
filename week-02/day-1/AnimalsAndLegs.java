import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner sc = new Scanner(System.in);
        int chicken = sc.nextInt();
        int pig = sc.nextInt();

        System.out.println(chicken*2 + pig*4);
    }
}
