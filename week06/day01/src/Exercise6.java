import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {
  public static void main(String[] args) {

    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    List<String> strartsAendsI = cities.stream()
            .filter(s -> s.startsWith("A"))
            .filter(s -> s.endsWith("I"))
            .collect(Collectors.toList());

    System.out.println(strartsAendsI);
  }
}
