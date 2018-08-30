public class TrickyAvg {

  public static void main(String[] args) {
    int[] numberArray = {-2, -4, -4, -2};
    System.out.println(getTrickyAvg(numberArray));
  }

  public static double getTrickyAvg(int[] numberArray) {
    double smallestOdd = 0;
    double biggestEven = 0;

    for (int i = 0; i < numberArray.length; i++) {
      if (numberArray[i] % 2 != 0)
        smallestOdd = numberArray[i];
      if (numberArray[i] % 2 == 0)
        biggestEven = numberArray[i];
    }

    for (int i = 0; i < numberArray.length; i++) {
      if (numberArray[i] < smallestOdd && numberArray[i] % 2 != 0)
        smallestOdd = numberArray[i];
      if (numberArray[i] > biggestEven && numberArray[i] % 2 == 0)
        biggestEven = numberArray[i];
    }
    return (biggestEven + smallestOdd) / 2;
  }
}
