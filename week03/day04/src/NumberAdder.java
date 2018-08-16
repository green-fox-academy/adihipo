public class NumberAdder {
  public static void main(String[] args) {
    System.out.println(adder(4));
  }

  public static int adder(int n) {
    int number = 0;
    if (n == 0) {

    } else {
      number += adder(n - 1) + n;
      System.out.println(number);
    }
    return number;
  }
}
