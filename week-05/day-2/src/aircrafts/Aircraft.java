package aircrafts;

public class Aircraft {
  private String type;
  private int baseDamage;
  private int maxAmmo;
  private int ammoStore;

  public int fight() {
    int tempAmmoStore = ammoStore;
    ammoStore = 0;
    int damage = baseDamage * tempAmmoStore;
    return damage;

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

  public Aircraft(String type, int baseDamage, int maxAmmo, int ammoStore) {
    this.type = type;
    this.baseDamage = baseDamage;
    this.maxAmmo = maxAmmo;
    this.ammoStore = ammoStore;
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
