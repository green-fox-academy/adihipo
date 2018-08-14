import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    String file = "log.txt";
    Path getPath = Paths.get(file);
    try {
      List<String> lines = Files.readAllLines(getPath);
      for (String line : lines) {
        System.out.println(line);
      }
      //System.out.println(uniqIP(lines));
      //System.out.println(ratioGetPost(lines));
    } catch (IOException ex) {
      System.out.println("Unable to read file: " + file);
    }
  }

//  public static ArrayList uniqIP(List<String> lines) {
//    ArrayList<String> IPs = new ArrayList<>();
//
//    return IPs;
//  }
//
//  public static double ratioGetPost(String file) {
//    double ratio;
//    return ratio;
//  }
}