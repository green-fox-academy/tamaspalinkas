import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner sc = new Scanner(System.in);
        System.out.println("Please specify distance in KM to convert to miles");
        int distanceInKm = sc.nextInt();

        double mile = 0.621371;

        double convertedValue = distanceInKm * mile;

        System.out.println(convertedValue);

    }
}
