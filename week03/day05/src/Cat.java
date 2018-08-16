public class Cat {
  int hunger = 3;
  int thirst = 3;
  String name;

  public void Cat(String name){
    this.name = name;
  }

  public void eat() {
    hunger--;
  }

  public void drink() {
    thirst--;
  }

  public void play() {
    hunger++;
    thirst++;
  }
}
