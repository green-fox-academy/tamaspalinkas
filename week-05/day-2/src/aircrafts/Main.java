package aircrafts;

public class Main {
  public static void main(String[] args) {
    Aircraft aircraft = new Aircraft("F35", 50, 12, 0);
    System.out.println(aircraft.refill(300));
    System.out.println(aircraft.fight());

    System.out.println(aircraft.getStatus());
  }
}
