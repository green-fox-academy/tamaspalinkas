package garden;

public class Plant {
  private String color;
  private double waterLevel;
  private double absorb;
  private int minWaterAmount;

  public boolean needsWatering() {
    return (waterLevel < minWaterAmount);
  }


  public void water(double water) {
    this.waterLevel += water * absorb;
  }


  public Plant(String color, double absorb, int minWaterAmount) {
    this.color = color;
    waterLevel = 0;
    this.absorb = absorb;
    this.minWaterAmount = minWaterAmount;
  }

  @Override
  public String toString() {
    return "The " + color + " " + this.getClass() + " needs water :" + needsWatering();
  }
}
