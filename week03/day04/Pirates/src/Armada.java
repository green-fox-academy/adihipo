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

public void
}
