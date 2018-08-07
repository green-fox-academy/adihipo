import java.util.*;

public class appendLetter {
  public static void main(String... args) {
    List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
    System.out.println(appendA(far));
  }

  public static List<String> appendA(List<String> far) {
    for (int i = 0; i < far.size(); i++) {
      far.set(i, far.get(i) + "a");
    }
    return far;
  }
}