package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {
    List<Ship> ships = new ArrayList<>();

    public boolean war(Armada otherArmada) {
        while (ships.size() != 0 && otherArmada.ships.size() != 0) {
            if (ships.get(0).battle(otherArmada.ships.get(0))) {
                otherArmada.ships.remove(0);
            } else {
                ships.remove(0);
            }
        }
        return  (ships.size() > otherArmada.ships.size());
    }
}
