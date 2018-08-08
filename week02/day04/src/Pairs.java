import java.util.*;
import java.util.Scanner;

public class Pairs {
  public static void main(String... args) {
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<String> girls;
    ArrayList<String> boys;

    System.out.println("Ladies first. After typing each girl's name, hit ENTER. When done, type END then hit ENTER: ");
    girls = getNames(names);
    names.clear();

    System.out.println("Now the boys. After typing each boy's name, hit ENTER. When done, type END then hit ENTER: ");
    boys = getNames(names);
    names.clear();

    System.out.println(makingMatches(girls, boys));
  }

  public static ArrayList getNames(ArrayList names) {
    boolean END = false;
    for (int i = 0; END == false; i++) {
      Scanner scanner = new Scanner(System.in);
      String Name = scanner.next();
      if (Name.equals("END")) {
        END = true;
      } else {
        names.add(Name);
      }
    }
    return names;
  }

  public static String makingMatches(ArrayList girls, ArrayList boys) {
    String pairs = "";
    if (girls.size() > boys.size()) {
      for (int i = 0; i < boys.size(); i++) {
        girls.add(i * 2, boys.get(i));
      }
      for (int i = 0; i < girls.size() - 1; i += 2) {
        pairs += girls.get(i) + "  <3  " + girls.get(i + 1) + "\n";
        if (i + 3 == girls.size()) {
          pairs += girls.get(girls.size() - 1) + "  </ /3";
        }
      }
    }

    if (girls.size() < boys.size()) {
      for (int i = 0; i < girls.size(); i++) {
        boys.add(i * 2, girls.get(i));
      }
      for (int i = 0; i < boys.size() - 1; i += 2) {
        pairs += boys.get(i) + "  <3  " + boys.get(i + 1) + "\n";
        if (i + 3 == boys.size()) {
          pairs += boys.get(boys.size() - 1) + "  </ /3";
        }
      }
    }
    return pairs;
  }
}