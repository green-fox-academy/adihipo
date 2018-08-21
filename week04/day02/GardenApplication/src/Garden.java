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
      System.out.println("Plant type: " + this.garden.get(i).color + " " + this.garden.get(i).whatPlant() + "\nWater level: " + this.garden.get(i).waterLevel + "\nNeeds water? " + this.garden.get(i).needsWater() + "\n");
    System.out.println("----------------------------");
  }

  void water(int amountOfWater) {
    System.out.println("You used " + amountOfWater + " amount of water. Thanks!");
    int divisor = 0;
    double watering;
    for (int i = 0; i < this.garden.size(); i++) {
      if (this.garden.get(i).needsWater()) {
        divisor++;
      }
    }
    watering = amountOfWater / divisor;
    for (int i = 0; i < this.garden.size(); i++) {
      if (this.garden.get(i).needsWater()) {
        this.garden.get(i).waterLevel += (watering * this.garden.get(i).absorb);
      }
    }
    this.seeGarden();
  }
}
