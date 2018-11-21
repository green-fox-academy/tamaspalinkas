package comparable.things;

public class Thing implements Comparable<Thing> {
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  @Override
  public int compareTo(Thing o) {
    if (this.completed == o.completed) {
      return this.name.compareTo(o.name);
    } else if (this.completed && !o.completed) {
      return 1;
    }
    return -1;

  }
}