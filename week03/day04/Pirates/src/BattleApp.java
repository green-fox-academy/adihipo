import java.util.ArrayList;

public class BattleApp {
  public static void main(String[] args) {
    //For Pirates

//    Pirate Parrot = new Pirate();
//    Parrot.rumDrunken = 3;
//    System.out.println(Parrot.rumDrunken);
//    Parrot.howsItGoingMate();
//    Parrot.drinkSomeRum(2);
//    System.out.println(Parrot.rumDrunken);
//    Parrot.howsItGoingMate();
//    Parrot.drinkSomeRum(2);
//
//    Pirate Captain = new Pirate();
//    Captain.rumDrunken = 3;
//    System.out.println(Captain.luck);
//    System.out.println(Parrot.luck);
//    Captain.brawl(Parrot);
//    System.out.println(Captain.passedOut);
//    System.out.println(Parrot.passedOut);
//

    //For Ships

//    Ship ship1 = new Ship();
//    ship1.fillShip();
//    ship1.soutShip();
//
//    Ship ship2 = new Ship();
//    ship2.fillShip();
//    ship2.soutShip();
//
//    ship1.battle(ship2);
//    ship1.soutShip();
//    ship2.soutShip();

    //For Armada

    Armada armada1 = new Armada();
    armada1.fillArmada();

    Armada armada2 = new Armada();
    armada2.fillArmada();

    armada1.battleOfArmadas(armada2);
  }
}
