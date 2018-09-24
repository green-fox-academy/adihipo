public class PokerMain {

  public static void main(String[] args) {

    Poker poker = new Poker();
    poker.blackCards = poker.getFiveCardsRandomlyFromDeck();
    poker.whiteCards = poker.getFiveCardsRandomlyFromDeck();
    System.out.println(poker.whiteCards);
    System.out.println(poker.blackCards);
    System.out.println(poker.isItFlush(poker.blackCards));

  }

}
