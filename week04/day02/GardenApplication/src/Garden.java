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
    System.out.println(" ");
  }

  void water(int amountOfWater) {
    
  }
}
