package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  @Override
  public String sound() {
    return "Twang";
  }

  public ElectricGuitar(int n) {
    setNumberOfStrings(n);
    name = "Electric Guitar";
  }

  public ElectricGuitar() {
    name = "Electric Guitar";
    setNumberOfStrings(6);
  }
}
