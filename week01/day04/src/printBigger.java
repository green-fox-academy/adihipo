import java.util.Scanner;

public class printBigger {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter numero uno");
    int number1 = scanner.nextInt();
    System.out.println("Enter numero due");
    int number2 = scanner.nextInt();

    if(number1 > number2){
      System.out.println("Bigger: " + number1);
    } else {
      System.out.println("Bigger: " + number2);
    }
  }
}