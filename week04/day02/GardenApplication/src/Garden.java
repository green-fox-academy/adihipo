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
      System.out.println("Plant type: " + this.whatPlant(i) + "\n" + "Water level: " + this.garden.get(i).waterLevel);
  }

  String whatPlant(int index) {
    if (this.garden.get(index) instanceof Flower)
      return "Flower";
    if (this.garden.get(index) instanceof Tree)
      return "Tree";
    return "somethingNew";
  }

  void water(int amountOfWater) {
    System.out.println("You used " + amountOfWater + " amount of water. Thanks!");
    int divisor = 0;
    double watering;
    for (int i = 0; i < this.garden.size(); i++) {
      if (this.garden.get(i).waterLevel < this.garden.get(i).needsWaterTil) {
        divisor++;
      }
    }
    watering = amountOfWater / divisor;
    for (int i = 0; i < this.garden.size(); i++) {
      if (this.garden.get(i).waterLevel < this.garden.get(i).needsWaterTil) {
        this.garden.get(i).waterLevel += watering;
      }
    }
    this.seeGarden();
  }
}
