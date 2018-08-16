public class Cat {
  String name;
  int catPower;

  public void Cat(String name) {
    this.name = name;
  }

  public void catFight(Cat otherCat) {
    this.catPower -= 3;
    otherCat.catPower -= 3;
  }
}
