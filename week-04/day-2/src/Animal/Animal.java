package Animal;

public class Animal {
  public int hunger = 50;
  public int thirst = 50;

  public void eat() throws Exception {
    hunger--;
    if (hunger == 0) {
      throw new Exception("Can't eat more!");
    }
  }

  public void drink() throws Exception {
    thirst--;
    if (thirst == 0) {
      throw new Exception("Can't drink more!");
    }
  }

  public void play() {
    hunger++;
    thirst++;
  }
}
