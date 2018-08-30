import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogsLikeBen {
  public static void main(String[] args) {
    String filename = "src/log.txt";
    System.out.println(getIPs(filename));
  }

  public static ArrayList<String> getIPs(String filename) {
    ArrayList<String> IPs = new ArrayList<>();
    Pattern pattern = Pattern.compile("\\d{2}\\.\\d{2}\\.\\d{2}\\.\\d{2}");
    Path getPath = Paths.get(filename);
    try {
      List<String> lines = Files.readAllLines(getPath);
      Matcher matcher = pattern.matcher(lines.toString());
      while (matcher.find()) {
        IPs.add(matcher.group());
      }
    } catch (IOException ex) {
      System.out.println("Unable to read file: " + filename);
    }
    return IPs;
  }
}
