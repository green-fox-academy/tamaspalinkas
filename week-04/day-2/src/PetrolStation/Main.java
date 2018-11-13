package PetrolStation;

public class Main {
    public static void main(String[] args) {
        Station station = new Station();
        System.out.println(station.gasAmount);

        Car car = new Car();
        System.out.println(car.gasAmount);

        station.refill(car);
        System.out.println(station.gasAmount);
        System.out.println(car.gasAmount);
    }

}
