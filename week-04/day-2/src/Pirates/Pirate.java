package Pirates;

public class Pirate {
    int alcoholLevel;
    boolean isAlive = true;

    public void drinkSomeRum() {
        alcoholLevel++;
    }

    public void howItGoingMate() {
        if (isAlive) {
            if (alcoholLevel < 5) {
                System.out.println("Pour me anudder!");
            } else {
                System.out.println("How d'ya d'ink its goin?");
                passOut();
            }
        } else {
            System.out.println("He's dead");
        }

    }

    public void passOut() {
        alcoholLevel = 0;
    }

    public void die() {
        isAlive = false;
    }

    public void brawl(Pirate pirate) {
        if (pirate == this) {
            System.out.println("Can't fight myself");

        } else {
            int rand = (int) (Math.random() * 3);
            if (rand == 0) {
                pirate.die();
            } else if (rand == 1) {
                this.die();
            } else {
                pirate.passOut();
                this.passOut();
            }
        }
    }
}
