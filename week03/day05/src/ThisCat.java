public class ThisCat {
  public static void main(String[] args) {
    Cat cat1 = new Cat();
    cat1.name = "Mittens";

    Cat cat2 = new Cat();
    cat2.name = "Lily";

    System.out.println(cat1.name);
    System.out.println(cat2.name);
  }
}
