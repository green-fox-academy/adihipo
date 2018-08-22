package main.java.wanderer;

import java.awt.*;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

  public static void main(String[] args) {
    try {
      Path getPath = Paths.get("fist.mp4");
      Desktop.getDesktop().open(new File(String.valueOf(getPath)));
    } catch (Exception ex) {
      System.out.println("Video not found sorry. It would have been fun...");
    }
  }
}