import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MostProductiveYear {
  public static void main(String[] args) {
    String filename = "src/marvel.txt";
    getMostProductiveYear(filename);
  }

  public static void getMostProductiveYear(String filename) {
    Path path = Paths.get(filename);
    try {
      List<String> lines = Files.readAllLines(path);
      List<String> years = new ArrayList<>();
      HashMap<String, Integer> yearMap = new HashMap<>();
      for (int i = 0; i < lines.size(); i++) {
        String movieDate = lines.get(i).split(",")[1];
        years.add(movieDate);
      }
      int counter = 1;
      for (int i = 0; i < years.size(); i++) {
        if (yearMap.containsKey(years.get(i))) {
          counter++;
        } else {
          counter = 1;
        }
        yearMap.put(years.get(i), counter);
      }
      int valueOfTheBestYear = 0;
      for (String key : yearMap.keySet()) {
        if (valueOfTheBestYear < yearMap.get(key)) {
          valueOfTheBestYear = yearMap.get(key);
        }
      }
      String mostValuableYear;
      for (String key : yearMap.keySet()) {
        if (yearMap.get(key).equals(valueOfTheBestYear)) {
          mostValuableYear = key;
          System.out.println("The most valuable year of the studio was " + mostValuableYear + " with " + valueOfTheBestYear + " movies.");
        }
      }
    } catch (IOException ex) {
      System.out.println("Unable to open file, sorry master!");
    }
  }
}
