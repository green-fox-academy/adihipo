import java.util.Scanner;

public class parametricAverage {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number:");
    int n = scanner.nextInt();
    System.out.println("Enter " + n + " numbers:");
    int nav = n;
    int number = scanner.nextInt();
    int sum = number;
    for(n = n; n > 1; n--){
      int numbern = scanner.nextInt();
      sum += numbern;
    }
    System.out.println("Sum is: " + sum);
    double av = sum / nav;
    System.out.println("Average is: " + av);
  }
}