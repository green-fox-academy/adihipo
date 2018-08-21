import java.util.ArrayList;
import java.util.List;

public class Carrier {
  List<Aircraft> carrier;
  int ammo;
  int HP;

  public Carrier(int ammo, int HP) {
    carrier = new ArrayList<>();
    this.ammo = ammo;
    this.HP = HP;
  }

  void addAircraft(Aircraft aircraft) {
    this.carrier.add(aircraft);
  }

  void fill() {
    if (this.ammo == 0) {
      System.out.println("Zero ammo, nothing to refill with maaan!");
    } else {
      for (int i = 0; i < this.carrier.size(); i++) {
        if (this.carrier.get(i).isPriority()) {
          this.carrier.get(i).refill(this.ammo);
          if (this.ammo == 0)
            break;
        }
      }
      for (int i = 0; i < this.carrier.size(); i++) {
        if (!this.carrier.get(i).isPriority()) {
          this.carrier.get(i).refill(this.ammo);
          if (this.ammo == 0)
            break;
        }
      }
    }
  }

  int allDamage() {
    int allDamage = 0;
    for (int i = 0; i < this.carrier.size(); i++) {
      allDamage += this.carrier.get(i).allDamage();
    }
    return allDamage;
  }

  void fight(Carrier otherCarrier) {
    if (this.allDamage() <= otherCarrier.HP) {
      otherCarrier.HP -= this.allDamage();
    } else {
      otherCarrier.HP = 0;
    }
  }

  void getStatus() {
    if (this.HP == 0) {
      System.out.println("It's dead Jim :(");
    } else {
      System.out.println("HP: " + this.HP + ", Aircaft count: " + this.carrier.size() + ", Ammo storage: " + this.ammo + ", Total Damage: " + this.allDamage() + "\n Aircraft:\n");
      for (int i = 0; i < this.carrier.size(); i++) {
        this.carrier.get(i).getStatus();
      }
    }
  }
}
