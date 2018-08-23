import java.util.Scanner;

public class CAB {

  String numberToGuess = "1234";
  String yourGuess = "";
  String cowsnbulls = "";
  int numberOfGuesses = 0;


  public void cowsAndBulls() {
    reset();
    yourGuess = getYourGuess();
    cowsnbulls = getCowsnBulls();
    status();
  }

  public void reset() {
    cowsnbulls = "";
    yourGuess = "";
  }

  public String getYourGuess() {
    for (int i = 0; i < 4; i++) {
      System.out.println("Please type your " + (i + 1) + ". number");
      Scanner scanner = new Scanner(System.in);
      yourGuess += scanner.nextInt();
    }
    return yourGuess;
  }

  public String getCowsnBulls() {
    for (int i = 0; i < 4; i++) {
      if (numberToGuess.charAt(i) == yourGuess.charAt(i)) {
        cowsnbulls += "bull ";
      } else if (numberToGuess.contains(yourGuess.substring(i, i + 1))) {
        cowsnbulls += "cow ";
      } else cowsnbulls += yourGuess.charAt(i) + " ";
    }
    return cowsnbulls;
  }

  public void status() {
    System.out.println("Your guess is:");
    System.out.println(yourGuess);
    System.out.println(cowsnbulls);
    numberOfGuesses++;
    System.out.println("Number of your guesses so far: " + numberOfGuesses);
    if (numberToGuess.equals(yourGuess)) {
      System.out.println("You won!");
    } else {
      System.out.println("You lose, try again!");
      System.out.println();
      cowsAndBulls();
    }
  }
}
