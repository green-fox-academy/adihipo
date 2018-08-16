public class Power {
  public static void main(String[] args) {
    int baseNumber = 3;
    int powerNumber = 3;
    System.out.println(power(baseNumber, powerNumber));
  }

  public static int power(int baseNumber, int powerNumber) {
    if (powerNumber == 1) {
      return baseNumber;
    } else {
      return power(baseNumber, (powerNumber-1)) * baseNumber;
    }
  }
}
