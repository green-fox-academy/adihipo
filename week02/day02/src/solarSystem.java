import java.util.*;

public class solarSystem {
  public static void main(String... args) {
    ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));
    System.out.println(putSaturn(planetList));
  }

  public static List putSaturn(ArrayList planetList) {
    planetList.add("Saturn");
    return planetList;
  }
}