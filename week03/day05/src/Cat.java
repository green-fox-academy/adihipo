class Cat {
  String name;
  int catPower;

  void naming(String nameOfCat) {
    name = nameOfCat;
  }

  void meow() {
    System.out.println("Meow! My name is :   " + name + "\nMy power neow:       " + catPower + "\n");
  }

  void catFight(Cat otherCat) {
    catPower -= 3;
    otherCat.catPower -= 3;
  }
}
