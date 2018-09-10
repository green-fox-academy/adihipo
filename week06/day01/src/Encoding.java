import java.util.stream.Collectors;

public class Encoding {
  public static void main(String[] args) {

    String string = "Mi ez a szöveg?";

    string.chars();                //works with ASCII codes, String stream
    String encodedString = caesarEncode(string, 2);            //encoding
    System.out.println(encodedString);
  }

  private static String caesarEncode(String string, int offset) {
    return string.chars()
            .map(c -> c + offset)
            .mapToObj(c -> Character.toString((char) c))
            .collect(Collectors.joining());
  }
}
