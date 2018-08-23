import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    String firstString = "loyal";
    String secondString = "layol";
    System.out.println(isAnagram(firstString, secondString));
  }

  public static boolean isAnagram(String firstString, String secondString) {
    char[] firstArray = firstString.toCharArray();
    char[] secondArray = secondString.toCharArray();
    Arrays.sort(firstArray);
    Arrays.sort(secondArray);
    return Arrays.equals(secondArray, secondArray);
  }
}
