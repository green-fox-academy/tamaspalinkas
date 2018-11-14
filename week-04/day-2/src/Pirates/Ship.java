package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    List<Pirate> pirates = new ArrayList<>();

    public void fillShip() {
        Pirate captain = new Pirate();
        pirates.add(captain);

        int rand = (int) (Math.random() * 10);
        for (int i = 0; i < rand; i++) {
            pirates.add(new Pirate());
        }
    }

    public boolean battle(Ship otherShip) {
        if (otherShip == this) {
            System.out.println("Can't battle myself");
        } else {
            int shipScore = calculateScore();
            int otherShipScore = otherShip.calculateScore();

            if (shipScore > otherShipScore) {
                party();
                otherShip.lose();
                return true;
            } else {
                otherShip.party();
                lose();
                return false;
            }
        }
        return false;
    }

    public void lose() {
        int rand = (int) (Math.random() * pirates.size());
        for (int i = 0; i < rand; i++) {
            pirates.get(i).die();
        }
    }

    public void party() {
        for (Pirate pirate : pirates) {
            int rand = (int) (Math.random() * 10);
            for (int i = 0; i < rand; i++) {
                pirate.drinkSomeRum();
            }
        }
    }

    public int calculateScore() {
        int shipAlive = 0;

        for (int i = 0; i < pirates.size(); i++) {
            if (pirates.get(i).isAlive) {
                shipAlive++;
            }
        }

        return shipAlive - pirates.get(0).alcoholLevel;

    }

    @Override
    public String toString() {
        int captainConsumed = pirates.get(0).alcoholLevel;
        boolean captainAlive = pirates.get(0).isAlive;
        boolean captainPassedOut = pirates.get(0).alcoholLevel == 0;
        int numOfAlive = 0;
        for (int i = 0; i < pirates.size(); i++) {
            if (pirates.get(i).isAlive) {
                numOfAlive++;
            }
        }

        return "Captains consumed rum: " + captainConsumed +
                " Alive : " + captainAlive + " Passed out: "
                + captainPassedOut + " Number of alive pirates in the crew: " + (numOfAlive - 1);
    }
}
