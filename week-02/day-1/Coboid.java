import java.util.Scanner;

public class Coboid {
    // Write a program that stores 3 sides of a cuboid as variables (doubles)
    // The program should write the surface area and volume of the cuboid like:
    //
    // Surface Area: 600
    // Volume: 1000
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double sideA = sc.nextInt();
        double sideB = sc.nextInt();
        double sideC = sc.nextInt();

        double volume = sideA * sideB * sideC;
        double surfaceArea = 2 * ((sideA*sideB) + (sideB*sideC) + (sideC*sideA));

        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);

    }
}
