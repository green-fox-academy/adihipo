public class NumberAdder {
  public static void main(String[] args) {
    System.out.println(adder(7));
  }

  public static int adder(int n) {
    int number = 0;
    if (n > 0) {
      number += adder(n - 1) + n;
    }
    return number;
  }
}
