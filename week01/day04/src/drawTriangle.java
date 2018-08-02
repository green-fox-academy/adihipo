import java.util.Scanner;

public class drawTriangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number:");
    int n = scanner.nextInt();
    for(int i = 0; i < n+1; i++){
      for(int j =0; j < i+1; j++){
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}