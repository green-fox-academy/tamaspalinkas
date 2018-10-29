import java.util.Scanner;

public class PartyIndicator {
    // Write a program that asks for two numbers
    // The first number represents the number of girls that comes to a party, the
    // second the boys
    // It should print: The party is excellent!
    // If the the number of girls and boys are equal and 20 or more people are coming to the party
    //
    // It should print: Quite cool party!
    // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
    //
    // It should print: Average party...
    // If there are less people coming than 20
    //
    // It should print: Sausage party
    // If no girls are coming, regardless the count of the people

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfGirls = sc.nextInt();
        int numOfBoys = sc.nextInt();
        int peopleInParty = numOfGirls + numOfBoys;
        String partyStatus;

        if (numOfGirls == numOfBoys && peopleInParty >= 20) {
            partyStatus = "The party is excellent!";
        } else if (peopleInParty >= 20 && numOfGirls != 0) {
            partyStatus = "Quite a cool party!";
        } else if (peopleInParty < 20 && numOfGirls != 0) {
            partyStatus = "Average party...";
        } else {
            partyStatus = "Sausage party";
        }
        System.out.println(partyStatus);
    }
}
