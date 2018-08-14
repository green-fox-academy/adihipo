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
      System.out.println(uniqIP(lines));
      System.out.println(ratioGetPost(lines));
    } catch (IOException ex) {
      System.out.println("Unable to read file: " + file);
    }
  }

  public static ArrayList uniqIP(List<String> lines) {
    ArrayList<String> IPs = new ArrayList<>();
    for (int i = 0; i < lines.size(); i++) {
      String IP = lines.get(i).split("   ")[1];
      if (!IPs.contains(IP)) {
        IPs.add(IP);
      }
    }
    return IPs;
  }

  public static double ratioGetPost(List<String> lines) {
    double GET = 0;
    double POST = 0;
    ArrayList<String> GETPOST = new ArrayList<>();
    for (int i = 0; i < lines.size(); i++) {
      GETPOST.add(lines.get(i).split("   ")[2]);
      if (GETPOST.get(i).contains("GET")) {
        GET++;
      }
      if (GETPOST.get(i).contains("POST")) {
        POST++;
      }
    }
    double ratio = GET / POST;
    return ratio;
  }
}