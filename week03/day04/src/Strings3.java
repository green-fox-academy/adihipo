public class Strings3 {
  public static void main(String[] args) {
    String x = "xxxxxxxxx";
    int length = x.length();
    String yourNewAsteriskThingString = "";
    System.out.println(stringXToY(x, yourNewAsteriskThingString, length));
  }

  public static String stringXToY(String x, String yourNewAsteriskThingString, int length) {
    if (length == 1) {
      return yourNewAsteriskThingString += 'x';
    } else {
      return yourNewAsteriskThingString += "x*" + stringXToY(x, yourNewAsteriskThingString, length - 1);
    }
  }
}
