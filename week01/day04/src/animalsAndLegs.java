import java.util.Scanner;

public class animalsAndLegs {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number of chickens");
    int chicken = scanner.nextInt() * 2;
    System.out.println("Enter number of pigs");
    int pigs = scanner.nextInt() * 4;

    int sum = pigs + chicken;
    System.out.println("Number of legs: " + sum);
  }
}