package PetrolStation;

public class Station {
    int gasAmount = 10000;

    public void refill(Car car) {
        car.gasAmount += car.capacity;
        this.gasAmount -= car.capacity;
    }
}
