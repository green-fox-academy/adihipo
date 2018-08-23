import java.util.ArrayList;

public class Numbers {
  ArrayList<Integer> listOfNumbers = new ArrayList<>();

  public int sumOfElements(){
    int sum = 0;
    for (int i = 0; i < listOfNumbers.size(); i++) {
      sum += listOfNumbers.get(i);
    }
    return sum;
  }
}
