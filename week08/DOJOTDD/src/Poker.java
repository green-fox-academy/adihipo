import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Poker {

  List<String> list = new ArrayList<>(Arrays.asList("2H", "2D", "2C", "2S", "3H", "3D", "3C", "3S", "4H", "4D", "4C", "4S", "5H", "5D", "5C", "5S", "6H", "6D", "6C", "6S", "7H", "7D", "7C", "7S", "8H", "8D", "8C", "8S", "9H", "9D", "9C", "9S", "10H", "10D", "10C", "10S", "JH", "JD", "JC", "JS", "QH", "QD", "QC", "QS", "KH", "KD", "KC", "KS", "AH", "AD", "AC", "AS"));

  List<String> blackCards = new ArrayList<>();
  List<String> whiteCards = new ArrayList<>();


  public String giveCardFromListByIndex(int i) {
    return list.get(i);
  }

  public String getOneCardRandomlyFromDeck() {
    int i = (int) (Math.random() * list.size());
    return giveCardFromListByIndex(i);
  }

  public List<String> getFiveCardsRandomlyFromDeck() {
    List<String> cards = new ArrayList<>();
    while (cards.size() != 5) {
      String card = getOneCardRandomlyFromDeck();
      if (!cards.contains(card))
        cards.add(card);
    }
    removeDrawnCardsFromDeck(cards);
    return cards;
  }

  public void removeDrawnCardsFromDeck(List<String> cards) {
    for (int i = 0; i < cards.size(); i++) {
      list.remove(cards.get(i));
    }
  }


  public boolean isItStraghtFlush(List<String> hand) {
    isItFlush(hand);
    return true;
  }

  public boolean isItFlush(List<String> hand) {
    String suitOfFirstCard;
    if (isItTen(hand.get(0))) {
      suitOfFirstCard = hand.get(0).substring(2);
    } else {
      suitOfFirstCard = hand.get(0).substring(1);
    }
    for (int i = 1; i < hand.size(); i++) {
      if (isItTen(hand.get(i))) {
        if (!hand.get(i).substring(2).equals(suitOfFirstCard)) {
          return false;
        }
      } else {
        if (!hand.get(i).substring(1).equals(suitOfFirstCard)) {
          return false;
        }
      }
    }
    return true;
  }

  public boolean isItTen(String card) {
    if (card.length() == 3) {
      return true;
    }
    return false;
  }

}

