public class BattleApp {
  public static void main(String[] args) {
    Pirate Parrot = new Pirate("Gutten Morgen");
    Parrot.rumDrunken = 3;
    System.out.println(Parrot.rumDrunken);
    Parrot.howsItGoingMate();
    Parrot.drinkSomeRum(2);
    System.out.println(Parrot.rumDrunken);
    Parrot.howsItGoingMate();
    System.out.println(Parrot.luck);
    Parrot.drinkSomeRum(2);

    Pirate Captain = new Pirate("White Beard");
    Captain.rumDrunken = 3;
    System.out.println(Captain.luck);
    Captain.brawl("Gutten Morgen");
    System.out.println(Captain.passedOut);
    System.out.println(Parrot.passedOut);
  }
}
