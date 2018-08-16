public class Pirate {
  String name;
  int rumDrunken = 0;
  boolean passedOut = false;
  double luck = Math.random();

  public Pirate(String name) {
    this.name = name;
  }

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

  public void brawl(String name) {
    new Pirate(name).luck <= 1 / 3){
      Pirate(name).passedOut = true;
    }
  }
}
