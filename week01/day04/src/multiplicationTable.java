import java.util.Scanner;

public class multiplicationTable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number:");
    int number = scanner.nextInt();
    for(int i = 1; i<11; i++){
      System.out.println(i + " * " + number  +" = " + number*i);
    }
  }
}