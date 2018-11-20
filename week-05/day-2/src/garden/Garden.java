package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plant> plants;

  public Garden() {
    plants = new ArrayList<>();
  }

  public void fillGarden(Plant plant) {
    plants.add(plant);
  }


  public void water(int water) {
    System.out.println("Watering with " + water);
    int count = toWaterCount();
    for (Plant plant : plants) {
      if (plant.needsWatering()) {
        plant.water(water / count);
      }
    }
  }

  public int toWaterCount() {
    int toWater = 0;
    for (Plant plant : plants) {
      if (plant.needsWatering()) {
        toWater++;
      }
    }
    return toWater;
  }

  @Override
  public String toString() {
    String s = "";
    for (Plant plant : plants) {
      s += plant.toString();
      s += '\n';
    }
    return s;
  }
}
