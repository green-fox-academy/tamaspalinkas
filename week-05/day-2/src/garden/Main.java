package garden;

public class Main {
  public static void main(String[] args) {

    Garden garden = new Garden();

    garden.fillGarden(new Flower("yellow"));
    garden.fillGarden(new Flower("blue"));
    garden.fillGarden(new Tree("purple"));
    garden.fillGarden(new Tree("orange"));

    System.out.println(garden.toString());
    System.out.println();

    garden.water(40);
    System.out.println(garden.toString());
    System.out.println();

    garden.water(70);
    System.out.println(garden.toString());


  }
}
