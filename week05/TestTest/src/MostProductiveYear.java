import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MostProductiveYear {
  public static void main(String[] args) {
    String filename = "src/paramount.txt";
    getMostProductiveYear(filename);
  }

  public static void getMostProductiveYear(String filename) {
    Path path = Paths.get(filename);
    try {
      List<String> lines = Files.readAllLines(path);
      List<String> years = new ArrayList<>();
      int counter = 0;
      for (int i = 0; i < lines.size(); i++) {
        String movieDate = lines.get(i).split(",")[1];
        years.add(movieDate);
      }
      System.out.println(years);
    } catch (IOException ex) {
      System.out.println("Unable to open file, sorry master!");
    }
  }
}
