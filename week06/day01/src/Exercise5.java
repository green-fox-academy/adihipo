import java.util.stream.Collectors;

public class Exercise5 {
  public static void main(String[] args) {

    String string = "Howdy? Im fine!";

    String upperCaseChars = string.chars()
            .filter(x -> Character.isUpperCase(x))
            .mapToObj(c -> Character.toString((char) c))
            .collect(Collectors.joining(", "));

    System.out.println(upperCaseChars);
  }
}
