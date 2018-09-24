import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainTest {

  Main main = new Main();

  @Test
  public void checkListShouldReturnMinusOneWhenListIsEmpty() {
    List<Integer> list = new ArrayList<>();
    Assert.assertEquals(-1, main.checkList(list));
  }

  @Test
  public void checkListShouldReturnZeroWhenListIsNotEmpty() {
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
    Assert.assertEquals(0, main.checkList(list));
  }

  @Test
  public void getIndexShouldReturnIndexWhenValueIsInList() {
    List<Integer> list = new ArrayList<>(Arrays.asList(1,23));
    Assert.assertEquals(1, main.getIndex(23, list));

  }

  @Test
  public void getIndexShouldReturnMinusOneWhenValueIsNotInList() {
    List<Integer> list = new ArrayList<>(Arrays.asList(1,23));
    Assert.assertEquals(-1, main.getIndex(25, list));

  }


}