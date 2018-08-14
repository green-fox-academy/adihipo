import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.

    String filename = "win-o.txt";
    ticTacResult(filename);
  }

  public static String ticTacResult(String filename) {
    Path path = Paths.get(filename);
    try {
      List<String> lines = Files.readAllLines(path);
    } catch (IOException ex) {
      System.out.println("Unable to read file: " + filename);
    }
    return "O";
    return "X";
    return "DRAW";
  }
}