public class Main {
  public static void main(String[] args) {
    Garden garden1 = new Garden();
    Flower flower1 = new Flower("yellow");
    garden1.addPlant(flower1);
    Flower flower2 = new Flower("blue");
    garden1.addPlant(flower2);
    Tree tree1 = new Tree("purple");
    garden1.addPlant(tree1);
    Tree tree2 = new Tree("orange");
    garden1.addPlant(tree2);

    garden1.seeGarden();
    garden1.water(20);
    garden1.water(20);
  }
}
