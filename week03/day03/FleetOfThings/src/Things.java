/**
 * Created by aze on 2017.03.29..
 */
public class Things {
  private String name;
  private boolean completed;

  public Things(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }
}