class Cat {
  String name;
  int catPower;

  void naming(String name) {
    this.name = name;
  }

  void meow() {
    System.out.println("Meow! My name is :   " + name + "\nMy power neow:       " + catPower + "\n");
  }

  void catFight(Cat otherCat) {
    this.catPower -= 3;
    otherCat.catPower -= 3;
  }
}
