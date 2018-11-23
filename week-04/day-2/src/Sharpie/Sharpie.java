package Sharpie;

public class Sharpie {
  public String color;
  public double width;
  public double inkAmount;

  public Sharpie(String color, double width) {
    this.color = color;
    this.width = width;
    this.inkAmount = 100;
  }

  public void use() throws Exception {
    if (inkAmount <= 0){
      throw new Exception("Can't use an empty Sharpie");
    }
    this.inkAmount--;
  }
}
