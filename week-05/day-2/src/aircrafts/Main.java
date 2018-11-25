package aircrafts;

public class Main {
  public static void main(String[] args) {
    Aircraft aircraft = new Aircraft("F35");
    System.out.println(aircraft.refill(300));
    System.out.println(aircraft.fight());

    System.out.println(aircraft.getStatus());
    System.out.println(aircraft.isPriority());

    System.out.println("================");

    Carrier carrier = new Carrier(21344, 324442);
    carrier.add(aircraft);

    Aircraft aircraft1 = new Aircraft("F35");
    Aircraft aircraft2 = new Aircraft("F16");

    carrier.add(aircraft2);
    carrier.add(aircraft1);

    aircraft.refill(212);
    aircraft1.refill(22);

    System.out.println(carrier.getStatus());
  }
}
