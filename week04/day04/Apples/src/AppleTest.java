import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppleTest {

    @Test
    public void testAppe(){
      Apple myObject = new Apple();
      assertEquals("apple", myObject.getApple());
    }
}