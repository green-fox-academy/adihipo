public class Hero extends BaseHero implements Punchable {
  private int motivation;

  Hero(String name) {
    super(name);
  }

  Hero(String name, int motivation) {
    super(name);
    this.motivation = motivation;
  }

  @Override
  public void punch(Punchable other) {
    if (this.getMotivationLevel() > 0) {
      double damage = this.motivation / 1.5;
      other.bePunched(damage);
    }
  }

  @Override
  public int getMotivationLevel() {
    if (this.motivation > 40) {
      return 2;
    } else if (this.motivation <= 40 && this.motivation >= 20) {
      return 1;
    } else
      return 0;
  }

  @Override
  public void bePunched(double damage) {
    this.motivation -= damage / this.motivation;
  }

  public void toStringHero() {
    if (this.getMotivationLevel() == 2) {
      System.out.println(this.getName() + " is well motivated");
    } else if (this.getMotivationLevel() == 1) {
      System.out.println(this.getName() + " is motivated");
    } else
      System.out.println(this.getName() + " is not motivated anymore");
  }

  public int setMotivation(int motivation) {
    return this.motivation = motivation;
  }

  public int getMotivation(int motivation) {
    return this.motivation = motivation;
  }
}
