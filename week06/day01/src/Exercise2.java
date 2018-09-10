import java.util.ArrayList;
import java.util.Arrays;

public class Exercise2 {
  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    double oddNumbersAvg = numbers.stream()
            .filter(x -> x % 2 != 0)
            .mapToInt(x -> x)
            .average().getAsDouble();

//    int[] numbersArray = new int[]{1, 2, 3};
//    double oddNumbersArrayAvg = Arrays.stream(numbersArray)
//            .average().getAsDouble();

    System.out.println(oddNumbersAvg);
  }
}
