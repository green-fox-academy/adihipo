public class TrickyAvg {

  public static void main(String[] args) {
    int[] numberArray = {1, 2, 3, 5};
    System.out.println(getTrickyAvg(numberArray));
  }

  public static double getTrickyAvg(int[] numberArray) {
    double number1;
    double number2;

    number1 = numberArray[0];
    for (int i = 1; i < numberArray.length; i++) {
      if (numberArray[i] < number1 && numberArray[i] % 2 == 1) {
        number1 = numberArray[i];
      }
    }

    number2 = numberArray[0];
    for (int i = 1; i < numberArray.length; i++) {
      if (numberArray[i] > number2 && numberArray[i] % 2 == 0) {
        number2 = numberArray[i];
      }
    }

    double avg = (number2 + number1) / 2;
    return avg;
  }
}
