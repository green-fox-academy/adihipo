import java.util.Scanner;

public class partyIndicator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Number of girls coming to the parteeeh: ");
    int n1 = scanner.nextInt();
    System.out.println("Number of boys coming to the parteeeh: ");
    int n2 = scanner.nextInt();

    int sum = n1+ n2;

    if(n1 ==0){
      System.out.println("Sausage party");
    }else
      if (sum > 20 && n1 == n2){
        System.out.println("The party is excellent!");
      }
      if(sum > 20 && n1 != n2){
        System.out.println("Quite cool party!");
      }
      if(sum < 20){
        System.out.println("Average party...");
      }
    }
  }