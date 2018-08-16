import java.util.ArrayList;

public class Armada {
  ArrayList<Ship> armada;
  Ship ship = new Ship();

  public Armada() {
    armada = new ArrayList<>();
  }

  public void fillArmada() {
    for (int i = 0; i < 20 + (int) (Math.random() * 5); i++) {
      armada.add(new Ship());
      armada.get(i).fillShip();
    }
  }

  public boolean battleOfArmadas(Armada otherArmada) {
    int i = 0;
    int j = 0;
    while (i <= armada.size() - 1 && j <= otherArmada.armada.size() - 1) {
      if (armada.get(i).battle(otherArmada.armada.get(j))) {
        j++;
      } else {
        i++;
      }
    }
    if (otherArmada.armada.size() == j) {
      System.out.println("Your armada won the war! Cheeers!");
      return true;
    } else {
      System.out.println("The other armada won...");
      return false;
    }
  }
}
