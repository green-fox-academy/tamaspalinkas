package printable;

public class Domino implements Comparable, Printable {
  private final int left;
  private final int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }

  @Override
  public int compareTo(Object o) {
    Domino compareDomino = (Domino) o;
    if (this.getLeftSide() < compareDomino.getLeftSide()) {
      return -1;
    } else {
      return 0;
    }
  }

  @Override
  public void printallFields() {
    System.out.println("Left side: " + left + " Right side: " + right);
  }
}