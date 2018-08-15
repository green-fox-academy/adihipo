public class Counter {
  int counter = 0;
  int init;

  public Counter() {
  }

  public Counter(int init) {
    this.init = init;
    counter = init;
  }

  public void add() {
    counter++;
  }

  public void add(int number) {
    counter += number;
  }

  public int get() {
    return counter;
  }

  public int reset() {
    this.counter = init;
    return counter;
  }
}
