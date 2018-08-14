import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    Path getPath = Paths.get("my-file.txt");
    System.out.println(lineCounter(getPath));
  }

  public static int lineCounter(Path getPath) {
    int counter = 0;
    try {
      List<String> lines = Files.readAllLines(getPath);
      for (String line : lines) {
        counter++;
      }
    } catch (IOException ex) {}
    return counter;
  }
}