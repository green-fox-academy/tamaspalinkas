package Counter;

public class Counter {
    int specifiedValue;
    int value;

    public Counter() {

    }

    public Counter(int value) {
        this.specifiedValue = value;
        this.value = value;
    }

    public void add(int number) {
        this.value += number;
    }

    public void add() {
        this.value++;
    }

    public int get() {
        return value;
    }

    public void reset() {
        this.value = specifiedValue;
    }
}
