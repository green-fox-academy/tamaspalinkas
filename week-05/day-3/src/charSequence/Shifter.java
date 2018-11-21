package charSequence;

public class Shifter implements CharSequence {
  String s;
  int n;

  public Shifter(String s, int n) {
    this.s = s;
    this.n = n;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return 0;
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
