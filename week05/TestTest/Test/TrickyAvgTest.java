import org.junit.Assert;
import org.junit.Test;

public class TrickyAvgTest {
  /**
   * Write your test cases here. You should be able to invoke the method like this:
   * double result = TrickyAverage.getTrickyAvg(input);
   */

  @Test
  public void getTrickyAvg_testCase1() {
    int[] numberArray1 = {3, 4, 5, 6};
    double result = TrickyAvg.getTrickyAvg(numberArray1);
    Assert.assertEquals(4.5, result, 0.0);
  }

  @Test
  public void getTrickyAvg_testCase2() {
    int[] numberArray1 = {5, 2, 8, -1};
    double result = TrickyAvg.getTrickyAvg(numberArray1);
    Assert.assertEquals(3.5, result, 0.0);
  }

}