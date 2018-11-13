package Animal;

public class Animal {
    public int hunger = 50;
    public int thirst = 50;

    public void eat() {
        hunger--;
    }

    public void drink() {
        thirst--;
    }

    public void play() {
        hunger++;
        thirst++;
    }

}
