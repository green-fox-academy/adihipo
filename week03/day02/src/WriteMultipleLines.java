import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  public static void main(String[] args) {
    List<String> content = new ArrayList<>();
    content.add("PINEAPPLE");
    int numberOfLines = 23;
    Path getPath = Paths.get("my-file.txt");
    writer(getPath, numberOfLines, content);
  }

  public static void writer(Path getPath, int numberOfLines, List content) {
    try {
      for (int i = 0; i < numberOfLines; i++) {
        Files.write(getPath, content, StandardOpenOption.APPEND);
      }
      System.out.println("Ok, added content");
    } catch (IOException ex) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}