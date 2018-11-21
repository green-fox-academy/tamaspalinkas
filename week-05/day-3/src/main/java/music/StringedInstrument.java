package main.java.music;

public abstract class StringedInstrument extends Instrument {
  private int numberOfStrings;

  @Override
  public void play() {
    System.out.println(name + " a " + numberOfStrings + "-stringed instrument that goes " + sound());
  }

  public void setNumberOfStrings(int n) {
    this.numberOfStrings = n;
  }

  public abstract String sound();

}
