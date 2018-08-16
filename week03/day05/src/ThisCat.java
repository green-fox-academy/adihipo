public class ThisCat {
  public static void main(String[] args) {
    Cat cat1 = new Cat();
    cat1.name = "Mittens";
    cat1.catPower = 5;
    System.out.println(cat1.name + ": catPower " + cat1.catPower);

    Cat cat2 = new Cat();
    cat2.Cat("Lily");
    cat2.catPower = 3;
    System.out.println(cat2.name + ": catPower " + cat2.catPower);

    cat1.catFight(cat2);
    System.out.println(cat1.name + ": catPower " + cat1.catPower);
    System.out.println(cat2.name + ": catPower " + cat2.catPower);
  }
}
