import java.util.Map;
import java.util.stream.Collectors;

public class Exercise7 {
  public static void main(String[] args) {

    String string = "How many times a character occurs?";


    Map<Character, Long> mapOfOccurences = string.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

    System.out.println(mapOfOccurences);
  }
}
