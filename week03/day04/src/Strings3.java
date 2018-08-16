public class Strings3 {
  public static void main(String[] args) {
    String x = "xxxxxxxxx";
    int length = x.length();
    System.out.println(stringXToY(x, length));
  }

  public static String stringXToY(String x, int length) {
    String yourNewAsteriskThingString = "";
    if (length == 2) {
      yourNewAsteriskThingString += '*';
    }
    if (length == 1) {
      yourNewAsteriskThingString += 'x';
    } else {
      stringXToY(x, length - 1);
    }
    return yourNewAsteriskThingString;
  }
}
