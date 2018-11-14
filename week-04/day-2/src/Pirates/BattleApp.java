package Pirates;

public class BattleApp {
    public static void main(String[] args) {

        Ship ship = new Ship();
        Ship otherShip = new Ship();

        ship.fillShip();
        otherShip.fillShip();
        System.out.println(ship.calculateScore());
        System.out.println(otherShip.calculateScore());

        ship.battle(otherShip);
        System.out.println(ship);
        System.out.println(otherShip);

    }
}
