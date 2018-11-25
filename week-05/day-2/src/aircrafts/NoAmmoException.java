package aircrafts;

public class NoAmmoException extends Exception {
  public NoAmmoException() {
    System.out.println("No ammo.");
  }
}
