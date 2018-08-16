public class ThisCat {
  public static void main(String[] args) {
    Cat cat1 = new Cat();
    cat1.name = "Mittens";
    cat1.catPower = 5;
    cat1.meow();

    Cat cat2 = new Cat();
    cat2.naming("Lily");
    cat2.catPower = 3;
    cat2.meow();

    cat1.catFight(cat2);
    cat1.meow();
    cat2.meow();
  }
}
