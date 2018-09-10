import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise10 {
  public static void main(String[] args) {

    Fox fox1 = new Fox("Dave", "Pallida", "green");
    Fox fox2 = new Fox("C", "Pallida", "green");
    Fox fox3 = new Fox("Adam", "Red", "red and white");
    Fox fox4 = new Fox("Chippy", "Desert", "green");
    Fox fox5 = new Fox("Kriszti", "Pallida", "greyish red");

    List<Fox> foxes = new ArrayList<>();
    foxes.add(fox1);
    foxes.add(fox2);
    foxes.add(fox3);
    foxes.add(fox4);
    foxes.add(fox5);

    System.out.println(greenPallidaFoxfinder(foxes));
  }

  public static List<Fox> greenPallidaFoxfinder(List<Fox> foxes) {
    List<Fox> greenPallidas = foxes.stream()
            .filter(f -> f.getColor().equals("green"))
            .filter(f -> f.getType().equals("Pallida"))
            .collect(Collectors.toList());

    return greenPallidas;
  }
}
