public class Strings {
  public static void main(String[] args) {
    String x = "xxxxxxxxx";
    int length = x.length();
    System.out.println(stringXToY(x, length));
  }

  public static String stringXToY(String x, int length) {
    if (length == 1) {
      return x.replace(x.charAt(1), 'y');
    } else {
      return stringXToY(x, length - 1);
    }
  }
}
