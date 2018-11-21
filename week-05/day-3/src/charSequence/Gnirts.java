package charSequence;

public class Gnirts implements CharSequence {
  String s;

  public Gnirts(String s) {
    this.s = s;
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
