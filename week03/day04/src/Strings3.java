public class Strings3 {
  public static void main(String[] args) {
    String x = "xxfdxxwwwx";
    System.out.println(stringXToY(x));
  }

  public static String stringXToY(String x) {
    int length = x.length();
    if (length == 0) {
      return x;
    } else {
      return x.charAt(0) + '*' + stringXToY(x.substring(1));
    }
  }
}
