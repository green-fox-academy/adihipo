//import java.io.IOException;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.Files;
//import java.nio.file.StandardOpenOption;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Logs {
//  public static void main(String[] args) {
//    String file = "log.txt";
//    System.out.println(uniqIP(file));
//    System.out.println(ratioGetPost(file));
//  }
//
//  public static String[] uniqIP(String file) {
//    String[] IPs;
//    Path getPath = Paths.get(file);
//    List<String> Files.readAllLines()
//    try {
//      for (int i = 0; i < numberOfLines; i++) {
//        Files.write(getPath, content, StandardOpenOption.APPEND);
//      }
//      System.out.println("Ok, added content");
//    } catch (IOException ex) {
//      System.out.println("Unable to read file: " + file);
//    }
//  }
//
//  public static double ratioGetPost(String file) {
//    double ratio;
//    Path getPath = Paths.get(file);
//    try {
//      for (int i = 0; i < numberOfLines; i++) {
//        Files.write(getPath, content, StandardOpenOption.APPEND);
//      }
//      System.out.println("Ok, added content");
//    } catch (IOException ex) {
//      System.out.println("Unable to read file: " + file);
//    }
//  }
//}