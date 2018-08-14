import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
    Path getPath = Paths.get("my-file.txt");
    try {
      List<String> lines = Files.readAllLines(getPath);
      for (String line : lines) {
        System.out.println(line);
      }
    } catch (IOException ex) {
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}