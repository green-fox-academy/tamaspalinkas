package main.java.music;

public class Violin extends StringedInstrument {
  @Override
  public String sound() {
    return "Screech";
  }

  public Violin(int n) {
    name = "Violin";
    setNumberOfStrings(n);
  }

  public Violin() {
    name = "Violin";
    setNumberOfStrings(4);
  }
}
