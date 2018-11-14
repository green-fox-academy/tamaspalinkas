package Pirates;

public class WarApp {
    public static void main(String[] args) {
        Armada armada1 = new Armada();
        Armada armada2 = new Armada();

        Ship ship1 = new Ship();
        ship1.fillShip();

        Ship ship2 = new Ship();
        ship2.fillShip();

        Ship ship3 = new Ship();
        ship3.fillShip();

        Ship ship4 = new Ship();
        ship4.fillShip();

        armada1.ships.add(ship1);
        armada1.ships.add(ship2);

        armada2.ships.add(ship3);
        armada2.ships.add(ship4);

        System.out.println(armada1.war(armada2));
    }
}
