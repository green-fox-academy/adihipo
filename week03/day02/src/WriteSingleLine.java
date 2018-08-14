import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    List<String> content = new ArrayList();
    content.add("Gyarmati Ádám");
    Path getPath = Paths.get("my-file.txt");
    try {
      Files.write(getPath, content, StandardOpenOption.APPEND);
      System.out.println("Ok, added content");
    } catch (IOException ex) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}