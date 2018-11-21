package main.java.music;

public class BassGuitar extends StringedInstrument {
  @Override
  public String sound() {
    return "Duum-duum-duum";
  }

  public BassGuitar(int n) {
    setNumberOfStrings(n);
    name = "Bass Guitar";
  }

  public BassGuitar() {
    name = "Bass Guitar";
    setNumberOfStrings(4);
  }
}
