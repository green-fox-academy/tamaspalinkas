import java.util.ArrayList;
import java.util.Arrays;

public class Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be the element of the list too
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
        ArrayList<String> matched = new ArrayList<>();


        while (boys.size() != 0 && girls.size() != 0) {
            matched.add(boys.get(0));
            matched.add(girls.get(0));
            boys.remove(0);
            girls.remove(0);
        }
        if (boys.size() != 0) {
            matched.addAll(boys);
        }
        if (girls.size() != 0) {
            matched.addAll(girls);
        }
        return matched;
    }
}