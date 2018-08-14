import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

  public static void main(String[] args) {
    String filename = "win-x.txt";
    System.out.println(ticTacResult(filename));
  }

  public static String ticTacResult(String filename) {
    Path path = Paths.get(filename);
    try {
      List<String> lines = Files.readAllLines(path);
      String row = "";
      String col = "";
      String diag = "";
      String anti = "";
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          row += lines.get(i).charAt(j);
          col += lines.get(j).charAt(i);
        }
        if (row.equals("XXX"))
          return "X";
        if (row.equals("OOO"))
          return "O";
        if (col.equals("XXX"))
          return "X";
        if (col.equals("OOO"))
          return "O";
        row = "";
        col = "";
        diag += lines.get(i).charAt(i);
        anti += lines.get(i).charAt(2 - i);
      }
      if (diag.equals("XXX"))
        return "X";
      if (diag.equals("OOO"))
        return "O";
      if (anti.equals("XXX"))
        return "X";
      if (anti.equals("OOO"))
        return "O";
    } catch (IOException ex) {
      System.out.println("Unable to read file: " + filename);
    }
    return "DRAW";
  }
}