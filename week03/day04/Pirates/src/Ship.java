import java.util.ArrayList;

public class Ship {
  ArrayList<Pirate> ship;
  Pirate pirate = new Pirate();

  public Ship() {
    ship = new ArrayList<>();
  }

  public void fillShip() {
    for (int i = 0; i < 10 + (int) (Math.random() * 20); i++) {
      ship.add(pirate);
    }
    ship.get(0).drinkSomeRum((int) (Math.random() * 3));
  }

  public void soutShip() {
    System.out.println("Captain rums: " + ship.get(0).rumDrunken + "\nCaptain passed out?  " + ship.get(0).passedOut + "\nCrew size: " + (ship.size() - 1));
  }

  public void battle(Ship otherShip) {
    if (ship.size() - 1 - ship.get(0).rumDrunken >= otherShip.ship.size() - 1 - otherShip.ship.get(0).rumDrunken) {
      System.out.println("Ship won!");
      this.win();
      otherShip.lose();
    } else {
      System.out.println("Ship lost...");
      otherShip.win();
      this.lose();
    }
  }

  public void win() {
    for (int i = 0; i < ship.size(); i++) {
      int randomDrink = 1 + (int) (Math.random() * 2);
      ship.get(i).drinkSomeRum(randomDrink);
    }
  }

  public void lose() {
    int randomDie = 3 + (int) (Math.random() * 6);
    for (int i = 1; i < randomDie; i++) {
      ship.get(i).die();
    }
  }
}
