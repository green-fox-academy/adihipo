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
    String filename = "log.txt";
    getIPs(filename);
  }

  public static ArrayList<String> getIPs(String filename) {
    ArrayList<String> IPs = new ArrayList<>();
    Pattern pattern = Pattern.compile("\\d{2}\\.\\d{2}\\.\\d{2}\\.\\d{2}");
    Matcher matcher = pattern.matcher(filename);
    Path getPath = Paths.get(filename);
    try {
      List<String> lines = Files.readAllLines(getPath);
    } catch (IOException ex) {
      System.out.println("Unable to read file: " + filename);
    }

    while (matcher.find()) {
      System.out.println(matcher.group());
    }


    return IPs;
  }
}
