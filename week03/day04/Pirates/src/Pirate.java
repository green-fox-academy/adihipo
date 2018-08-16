public class Pirate {
  int rumDrunken = 0;
  boolean passedOut = false;
  double luck = Math.random();

  public void drinkSomeRum(int numberOfRounds) {
    if (passedOut) {
      System.out.println("He's dead");
    } else {
      rumDrunken += numberOfRounds;
    }
  }

  public void howsItGoingMate() {
    if (passedOut) {
      System.out.println("He's dead");
    } else {
      if (rumDrunken <= 4) {
        System.out.println("Pour me anudder!");
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      }
    }
  }

  public void die() {
    passedOut = true;
  }

  public void brawl(Pirate otherPirate) {
    if (luck <= 0.33) {
      passedOut = true;
    }
    if (otherPirate.luck <= 0.33) {
      otherPirate.passedOut = true;
    }
  }
}
