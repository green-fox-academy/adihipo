import java.util.Scanner;

public class oneTwoALot {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number");
    int number = scanner.nextInt();

    if(number < 1){
      System.out.println("Not enough");
    } if (number == 1){
      System.out.println("One");
    } if (number == 2){
      System.out.println("Two");
    } if (number >2){
      System.out.println("A lot");
    }
  }
}