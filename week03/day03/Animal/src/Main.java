public class Main {
  public static void main(String[] args) {
    Animal animal1 = new Animal();
    animal1.name = "Todd the tiger";
    System.out.println(animal1.name);
    for (int i = 0; i < 40; i++) {
      animal1.eat();
      animal1.drink();
    }
    animal1.play();
    System.out.println("Thirst + hunger lvls: " + animal1.thirst + "  ,  " + animal1.hunger);
  }
}
