public class Main {

  public static void main(String[] args) {
    String firstString = "loyal";
    String secondString = "layol";
    System.out.println(isAnagram(firstString, secondString));
  }

  public static boolean isAnagram(String firstString, String secondString) {
    if (firstString.length() == secondString.length()) {
      for (int i = 0; i < firstString.length(); i++) {
        if (firstString.charAt(i) != secondString.charAt(secondString.length() - 1 - i)) {
          return false;
        }
      }
    } else return false;
    return true;
  }
}
