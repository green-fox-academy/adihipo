import java.util.Arrays;

public class DiceSet {
  int[] dices = new int[6];

  public int[] roll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
    return dices;
  }

  public int length() {
    return dices.length;
  }

  public int[] getCurrent() {
    for (int i = 0; i < dices.length; i++) {
      System.out.print(dices[i] + " ");
      if (i == dices.length - 1) {
        System.out.println("");
      }
    }
    return dices;
  }

  public int getCurrent(int i) {
    return dices[i];
  }

  public void reroll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
  }

  public void reroll(int k) {
    dices[k] = (int) (Math.random() * 6) + 1;
  }
}