import java.util.ArrayList;
import java.util.List;

public class Carrier {
  List<Aircraft> carrier;
  int ammoStorage;
  int HP;

  public Carrier(int ammo, int HP) {
    carrier = new ArrayList<>();
    this.ammoStorage = ammo;
    this.HP = HP;
  }

  void addAircraft(Aircraft aircraft) {
    this.carrier.add(aircraft);
  }

  void fill() {
    if (this.ammoStorage == 0) {
      System.out.println("Zero ammo, nothing to refill with maaan!");
    } else {
      for (int i = 0; i < this.carrier.size(); i++) {
        if (this.carrier.get(i).isPriority()) {
          this.ammoStorage = this.carrier.get(i).refill(this.ammoStorage);
          if (this.ammoStorage == 0)
            break;
        }
      }
      for (int i = 0; i < this.carrier.size(); i++) {
        if (!this.carrier.get(i).isPriority()) {
          this.ammoStorage = this.carrier.get(i).refill(this.ammoStorage);
          if (this.ammoStorage == 0)
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
    if (otherCarrier.allDamage() <= this.HP) {
      this.HP -= otherCarrier.allDamage();
    } else {
      this.HP = 0;
    }

    this.fireAllMunition();
    otherCarrier.fireAllMunition();
  }

  void fireAllMunition() {
    for (int i = 0; i < this.carrier.size(); i++) {
      this.carrier.get(i).fight();
    }
  }

  void getStatus() {
    if (this.HP == 0) {
      System.out.println("It's dead Jim :(");
    } else {
      System.out.println("HP: " + this.HP + ", Aircaft count: " + this.carrier.size() + ", Ammo storage: " + this.ammoStorage + ", Total Damage: " + this.allDamage() + "\nAircraft:");
      for (int i = 0; i < this.carrier.size(); i++) {
        this.carrier.get(i).getStatus();
      }
      System.out.println("------------------------------------------------------\n");
    }
  }
}
