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
    String filename = "my-file.txt";
    writer(filename, numberOfLines, content);
  }

  public static void writer(String filename, int numberOfLines, List content) {
    Path getPath = Paths.get(filename);
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