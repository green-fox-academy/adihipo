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
  }

  public void soutShip() {
    System.out.println("Captain rums: " + ship.get(0).rumDrunken + "\nCaptain passed out?  " + ship.get(0).passedOut + "\nCrew size: " + (ship.size() - 1));
    System.out.println(ship);
  }


}
