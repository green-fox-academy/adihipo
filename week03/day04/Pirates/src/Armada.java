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

  public String battleOfArmadas(Armada otherArmada) {
    int i = 0;
    int j = 0;
    while (i > armada.size() && j > otherArmada.armada.size()) {
      if (armada.get(i).battle(otherArmada.armada.get(j))) {
        j++;
      } else {
        i++;
      }
    }
    if (otherArmada.armada.size() - 1 == i) {
      return "Your armada won the war! Cheeers!";
    } else {
      return "The other armada won...";
    }
  }
}
