package aircrafts;

import java.util.List;

public class Carrier {
  private List<Aircraft> aircrafts;
  private int ammoStore;
  private int hp;

  public void add(Aircraft aircraft) {
    aircrafts.add(aircraft);
  }

  public void fill() {
    try {
      if (ammoStore == 0) {
        throw new NoAmmoException();
      }
      if (aircraftsTotalCapacity() < ammoStore) {
        for (Aircraft aircraft : aircrafts) {
          int remaining = aircraft.refill(ammoStore);
          ammoStore = remaining;
        }
      } else {
        for (Aircraft aircraft : aircrafts) {
          while (ammoStore != 0 && aircraft.isPriority()) {
            ammoStore = aircraft.refill(ammoStore);
          }
        }
      }

    } catch (NoAmmoException e) {
      System.out.println(e);
    }

  }

  public void fight(Carrier carrier) {

  }

  public int aircraftsTotalCapacity() {
    int capacity = 0;
    for (Aircraft aircraft : aircrafts) {
      capacity += aircraft.getMaxAmmo();
    }
    return capacity;
  }
}
