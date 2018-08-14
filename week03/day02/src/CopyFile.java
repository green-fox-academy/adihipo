import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    String filename1 = "my-file.txt";
    String filename2 = "my-file2.txt";
    System.out.println(copier(filename1, filename2));
  }

  public static boolean copier(String filename1, String filename2) {
    Path getPath1 = Paths.get(filename1);
    Path getPath2 = Paths.get(filename2);

    try {
      List<String> lines = Files.readAllLines(getPath1);
      Files.write(getPath2, lines, StandardOpenOption.APPEND);
      return true;
    } catch (IOException ex) {
      System.out.println("File not readable");
      return false;
    }
  }
}