import java.util.Scanner;

public class averageOfInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number 1");
    double n1 = scanner.nextInt();
    System.out.println("Enter number 2");
    double n2 = scanner.nextInt();
    System.out.println("Enter number 3");
    double n3 = scanner.nextInt();
    System.out.println("Enter number 4");
    double n4 = scanner.nextInt();
    System.out.println("Enter number 5");
    double n5 = scanner.nextInt();

    double average = (n1 + n2 + n3 + n4 + n5) / 5;
    System.out.println("Average of the 5 inputs: " + average);
  }
}