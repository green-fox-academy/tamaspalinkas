package comparable.things;

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
    removeObs.complete();

    Thing standUp = new Thing("Stand up");
    //standUp.complete();

    Thing eatLunch = new Thing("Eat lunch");
    eatLunch.complete();

    Thing a = new Thing("A");
    a.complete();
    fleet.add(a);

    Thing c = new Thing("c");
    a.complete();
    fleet.add(c);

    Thing b = new Thing("b");
    a.complete();
    fleet.add(b);

    fleet.add(milk);
    fleet.add(removeObs);
    fleet.add(standUp);
    fleet.add(eatLunch);

    fleet.sortArray();
    System.out.println(fleet);

  }
}