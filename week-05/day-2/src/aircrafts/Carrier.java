package aircrafts;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  private List<Aircraft> aircrafts;
  private int ammoStore;
  private int hp;

  public Carrier(int hp, int ammoStore) {
    this.hp = hp;
    this.ammoStore = ammoStore;
    aircrafts = new ArrayList<>();
  }

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
    carrier.hp -= this.airCraftsTotalDamage();

    for (Aircraft aircraft : aircrafts) {
      aircraft.resetAmmoStore();
    }

  }

  public int airCraftsTotalDamage() {
    int totalAircraftsDmg = 0;
    for (Aircraft aircraft : aircrafts) {
      totalAircraftsDmg += aircraft.aircraftDamage();
    }
    return totalAircraftsDmg;
  }

  public int aircraftsTotalCapacity() {
    int capacity = 0;
    for (Aircraft aircraft : aircrafts) {
      capacity += aircraft.getMaxAmmo();
    }
    return capacity;
  }

  public int aircraftsTotalAmmo() {
    int totalAmmo = 0;
    for (Aircraft aircraft : aircrafts) {
      totalAmmo += aircraft.getAmmoStore();
    }
    return totalAmmo;
  }

  public String listAirCrafts() {
    String list = "";
    for (Aircraft aircraft : aircrafts) {
      list += aircraft.getStatus() + "\n";
    }
    return list;
  }

  public String getStatus() {
    if (hp == 0) {
      return "It's dead Jim :(";
    }
    return "HP: " + hp + ", Aircraft count: " + aircrafts.size() +
            ", Ammo Storage : " + ammoStore + ", Total damage: " + airCraftsTotalDamage()
            + "\n" + listAirCrafts();
  }
}
