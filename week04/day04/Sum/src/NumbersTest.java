import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

  @Test
  public void testEmptyListWithSumOfElements() {
    Numbers list = new Numbers();
    assertEquals(0, list.sumOfElements());
  }

  @Test
  public void testOneElementListWithSumOfElements() {
    Numbers list = new Numbers();
    list.listOfNumbers.add(1);
    assertEquals(1, list.sumOfElements());
  }

  @Test
  public void testMultipleElementListWithSumOfElements() {
    Numbers list = new Numbers();
    for (int i = 0; i < 7; i++) {
      list.listOfNumbers.add(1);
    }
    assertEquals(7, list.sumOfElements());
  }
}