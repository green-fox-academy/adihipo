import com.sun.deploy.util.StringUtils;

import java.util.Map;
import java.util.stream.Collectors;

public class Exercise7 {
  public static void main(String[] args) {

    String string = "How many times a character occurs?";


    System.out.println(string.chars()
            .mapToObj(c -> Character.toString((char) c))
            .collect(Collectors.groupingBy(x -> x, Collectors.counting())));
  }
}
