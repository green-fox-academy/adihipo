import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

  int fibonacciNumber;
  String somethingElse;

  @BeforeEach
  public void beforeEach() {
    fibonacciNumber = 3;
    somethingElse = "James Bond";
  }

  @Test
  public void fibonacciTest() {
    assertEquals(fibonacciNumber, Fibonacci.fib(4));
  }

  @Test
  public void fibonacciTestSomethingElse() {
    assertNotEquals(somethingElse, Fibonacci.fib(4));
  }
}