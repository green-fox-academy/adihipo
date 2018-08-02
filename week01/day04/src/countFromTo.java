import java.util.Scanner;

public class countFromTo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number one:");
    int number1 = scanner.nextInt();
    System.out.println("Enter number two:");
    int number2 = scanner.nextInt();
    if(number1>number2){
      System.out.println("Number two should be bigger maaaaan, dontcha know it? Try again...");
    }else{
      for(int i = number1; i<number2; i++){
        System.out.println(i);
      }
    }
  }
}