import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Gimme a number. 10 will be divided by that. Tip: try 0!");
    int divisor = scanner.nextInt();

    try {
      int result = 10 / divisor;
      System.out.println(result);
    } catch (ArithmeticException ex) {
      System.out.println("fail");
    }

  }
}