import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    String string = "kecskekun";
    System.out.println(hashmapinator(string));
  }

  public static HashMap hashmapinator(String string) {
    HashMap<Character, Integer> vocab = new HashMap<>();
    char[] charArray = string.toCharArray();
    Arrays.sort(charArray);
    int n = 1;
    for (int i = 0; i < charArray.length; i++) {
      if (vocab.containsKey(charArray[i])) {
        n++;
      } else n = 1;
      vocab.put(charArray[i], n);
    }
    return vocab;
  }
}
