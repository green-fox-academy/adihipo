public class TrickyAvg {

  public static void main(String[] args) {
    int[] numberArray = {5, 2, 8, -1};
    System.out.println(getTrickyAvg(numberArray));
  }

  public static double getTrickyAvg(int[] numberArray) {
    double number1;
    double number2;

    number1 = numberArray[0];
    for (int i = 1; i < numberArray.length; i++) {
      if (numberArray[i] < number1 && numberArray[i] % 2 != 0) {
        number1 = numberArray[i];
      }
    }

    number2 = numberArray[0];
    for (int i = 1; i < numberArray.length; i++) {
      if (numberArray[i] > number2 && numberArray[i] % 2 == 0) {
        number2 = numberArray[i];
      }
    }
    
    return (number2 + number1) / 2;
  }
}
