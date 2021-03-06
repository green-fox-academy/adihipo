import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

  String yes1;
  String yes2;
  String no;

  @BeforeEach
  public void createStringsBeforeEach(){
    yes1 = "canon";
    yes2 = "nonac";
    no = "nonon";
  }

  @Test
  public void isAnagramShouldReturnTrue() {
    assertTrue(Main.isAnagram(yes1, yes2));
  }

  @Test
  public void isAnagramShouldReturnFalse() {
    assertFalse(Main.isAnagram(yes1, no));
  }
}