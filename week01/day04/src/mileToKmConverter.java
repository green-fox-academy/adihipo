import java.util.Scanner;

public class mileToKmConverter {
  public static void main(String[] args) {
    System.out.println("Enter km");
    Scanner scanner = new Scanner(System.in);
    double km = scanner.nextInt();
    double mile = km* 0.62137119223733;
    System.out.println("In miles: " + mile);
  }
}