package FleetOfThings;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch
        Thing milk = new Thing("Get milk");
        Thing removeObs = new Thing("Remove obstacles");

        Thing standUp = new Thing("Stand up");
        standUp.complete();

        Thing eatLunch = new Thing("Eat lunch");
        eatLunch.complete();

        fleet.add(milk);
        fleet.add(removeObs);
        fleet.add(standUp);
        fleet.add(eatLunch);


        System.out.println(fleet);
    }
}