package aircrafts;

public class Aircraft {
  private String type;
  private int baseDamage;
  private int maxAmmo;
  private int ammoStore;

  public int fight() {
    int damage = aircraftDamage();
    resetAmmoStore();
    return damage;
  }

  public int aircraftDamage() {
    return baseDamage * ammoStore;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public int getAmmoStore() {
    return ammoStore;
  }

  public void resetAmmoStore() {
    ammoStore = 0;
  }

  public int refill(int n) {
    if (maxAmmo > n) {
      ammoStore += n;
      return 0;
    } else {
      int remaining = 0;
      remaining = n - maxAmmo;
      ammoStore += maxAmmo;
      return remaining;
    }
  }

  public Aircraft(String type) {
    this.type = type;
    this.ammoStore = 0;

    if (type.equals("F16")) {
      maxAmmo = 8;
      baseDamage = 30;
    }

    if (type.equals("F35")) {
      maxAmmo = 12;
      baseDamage = 50;
    }
  }

  public String getType() {
    return type;
  }

  public String getStatus() {
    return "Type " + type + ", Ammo: " + ammoStore + ", Base Damage: " + baseDamage + ", All Damage: " + fight();
  }

  public boolean isPriority() {
    return type.equals("F35");

  }
}
