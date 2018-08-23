import java.util.Scanner;

public class CAB {

  int[] numberToGuess = {1, 2, 3, 4};
  int[] yourGuess = new int[4];
  String state = "playing";
  int numberOfGuesses = 0;


  public String cowsAndBulls() {
    for (int i = 0; i < 4; i++) {
      System.out.println("Please type your " + (i + 1) + ". number");
      Scanner scanner = new Scanner(System.in);
      yourGuess[i] = scanner.nextInt();
    }
    System.out.println("Your guess is:");
    System.out.println(yourGuess.toString());
    return yourGuess.toString();
  }
}
