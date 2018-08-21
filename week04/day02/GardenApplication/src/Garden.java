import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> garden;

  public Garden() {
    garden = new ArrayList<>();
  }

  void addPlant(Plant plant) {
    garden.add(plant);
  }

  void seeGarden() {
    for (int i = 0; i < this.garden.size(); i++)
      System.out.println("Plant type: " + this.garden.get(i).color + " " + this.whatPlant(i) + "\nWater level: " + this.garden.get(i).waterLevel + "\nNeeds water? " + this.needsWater(i) + "\n");
    System.out.println("----------------------------");
  }

  String whatPlant(int index) {
    if (this.garden.get(index) instanceof Flower)
      return "Flower";
    if (this.garden.get(index) instanceof Tree)
      return "Tree";
    return "somethingNew";
  }

  boolean needsWater(int index) {
    return this.garden.get(index).waterLevel < this.garden.get(index).needsWaterTil;
  }

  void water(int amountOfWater) {
    System.out.println("You used " + amountOfWater + " amount of water. Thanks!");
    int divisor = 0;
    double watering;
    for (int i = 0; i < this.garden.size(); i++) {
      if (this.needsWater(i)) {
        divisor++;
      }
    }
    watering = amountOfWater / divisor;
    for (int i = 0; i < this.garden.size(); i++) {
      if (this.needsWater(i)) {
        this.garden.get(i).waterLevel += (watering * this.garden.get(i).absorb);
      }
    }
    this.seeGarden();
  }
}
