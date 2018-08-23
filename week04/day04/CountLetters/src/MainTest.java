import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

  String string;
  HashMap<Character, Integer> otherMap;

  @BeforeEach
  public void beforeEach() {
    string = "majomvagy";
    otherMap = new HashMap<>();
    otherMap.put('a', 2);
    otherMap.put('v', 1);
    otherMap.put('g', 1);
    otherMap.put('y', 1);
    otherMap.put('j', 1);
    otherMap.put('m', 2);
    otherMap.put('o', 1);
  }

  @Test
  public void testHashmapinator() {
    assertEquals(otherMap, Main.hashmapinator(string));
  }
}