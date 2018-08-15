public class Main {
  public static void main(String[] args) {
    DiceSet sixDice = new DiceSet();
    sixDice.roll();
    sixDice.getCurrent();

    for (int i = 0; i < sixDice.length(); ) {
      if (sixDice.getCurrent(i) != 6) {
        sixDice.reroll(i);
      } else {
        i++;
      }
    }
    sixDice.getCurrent();
  }
}
