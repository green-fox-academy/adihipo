
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokerTest {

  Poker poker = new Poker();
  List<String> deck = new ArrayList<>(Arrays.asList("2H", "2D", "2C", "2S", "3H", "3D", "3C", "3S", "4H", "4D", "4C", "4S", "5H", "5D", "5C", "5S", "6H", "6D", "6C", "6S", "7H", "7D", "7C", "7S", "8H", "8D", "8C", "8S", "9H", "9D", "9C", "9S", "10H", "10D", "10C", "10S", "JH", "JD", "JC", "JS", "QH", "QD", "QC", "QS", "KH", "KD", "KC", "KS", "AH", "AD", "AC", "AS"));

  @Test
  public void giveCardFromListByIndexShouldReturnCard() {
    Assert.assertEquals("2H", poker.giveCardFromListByIndex(0));
  }

  @Test
  public void getOneCardRandomlyFromDeckShouldReturnCardFromTheList() {
    Assert.assertTrue(deck.contains(poker.getOneCardRandomlyFromDeck()));
  }

  @Test
  public void getFiveCardsRandomlyFromDeckShouldReturnFiveCardsFromTheList() {
    Assert.assertTrue(deck.containsAll(poker.getFiveCardsRandomlyFromDeck()));
  }

  @Test
  public void getFiveCardsRandomlyFromDeckShouldReturnFiveDifferentCardsFromTheList() {
    poker.getFiveCardsRandomlyFromDeck();
    Assert.assertNotEquals(deck.get(0), deck.get(1));
    Assert.assertNotEquals(deck.get(0), deck.get(2));
    Assert.assertNotEquals(deck.get(0), deck.get(3));
    Assert.assertNotEquals(deck.get(0), deck.get(4));
    Assert.assertNotEquals(deck.get(1), deck.get(2));
    Assert.assertNotEquals(deck.get(1), deck.get(3));
    Assert.assertNotEquals(deck.get(1), deck.get(4));
    Assert.assertNotEquals(deck.get(2), deck.get(3));
    Assert.assertNotEquals(deck.get(2), deck.get(4));
    Assert.assertNotEquals(deck.get(3), deck.get(4));

  }

  @Test
  public void removeDrawnCardsFromDeckShouldReturnListSizeDecreasedBFive() {
    poker.getFiveCardsRandomlyFromDeck();
    Assert.assertEquals(47, poker.list.size());
  }

  @Test
  public void doWeHaveStraigthFlushInHandShouldReturnFalseWhenNot(){
    List<String>hand=  new ArrayList<>(Arrays.asList("8H", "4D"," 6D", "8C", "10D"));
    Assert.assertFalse(poker.isItStraghtFlush(hand));
  }

  @Test
  public void doWeHaveStraigthFlushInHandShouldReturnTrueWhenYes(){
    List<String>hand=  new ArrayList<>(Arrays.asList("8H", "9H"," 10H", "JH", "QH"));
    Assert.assertTrue(poker.isItStraghtFlush(hand));
  }

  @Test
  public void doWeHaveFlushInHandShouldReturnTrueWhenYes(){
    List<String>hand=  new ArrayList<>(Arrays.asList("8H", "9H"," 10H", "JH", "QH"));
    Assert.assertTrue(poker.isItFlush(hand));
  }

}