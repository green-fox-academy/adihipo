import java.util.Scanner;

public class calculator {
  public static void main(String... args) {
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("Please type operand number one: ");
    double operand1 = scanner1.nextInt();

    Scanner scanner2 = new Scanner(System.in);
    System.out.println("Please type operator (+, -, *, /, %): ");
    String operator = scanner2.next();

    Scanner scanner3 = new Scanner(System.in);
    System.out.println("Please type operand number two: ");
    double operand2 = scanner3.nextInt();
    System.out.println(calculate(operator, operand1, operand2));
  }

  public static double calculate(String operator, double operand1, double operand2) {
    double result = 0;

    if (operator.equals("+")) {
      result += operand1 + operand2;
    }

    if (operator.equals("-")) {
      result += operand1 - operand2;
    }

    if (operator.equals("%")) {
      result += operand1 % operand2;
    }

    if (operator.equals("*")) {
      result += operand1 * operand2;
    }

    if (operator.equals("/")) {
      result += operand1 / operand2;
    }
    return result;
  }
}