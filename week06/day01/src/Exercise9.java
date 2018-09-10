import java.util.stream.Collectors;

public class Exercise9 {
  public static void main(String[] args) {

    char[] charArray = {'M', 'i', 'n', 'e', 'c', 'r', 'a', 'f', 't'};

    String charsAsString = new String(charArray).chars()
            .mapToObj(c -> Character.toString((char) c))
            .collect(Collectors.joining());

    System.out.println(charsAsString);



    String charAsString2 = new String(charArray);
    System.out.println(charAsString2);
  }
}
