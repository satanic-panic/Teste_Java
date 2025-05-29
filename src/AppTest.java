import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testReturnString_MultipleOf3And5() {
      App app = new App();
        assertEquals("ITClinical", app.returnString(15));
        assertEquals("ITClinical", app.returnString(30));
    }

    @Test
    public void testReturnString_MultipleOf3() {
      App app = new App();
      assertEquals("IT", app.returnString(3));
      assertEquals("IT", app.returnString(9));
    }

    @Test
    public void testReturnString_MultipleOf5() {
      App app = new App();
      assertEquals("Clinical", app.returnString(5));
      assertEquals("Clinical", app.returnString(10));
    }

     @Test
     public void testReturnString_NotMultipleof3or5() {
      App app = new App();
      assertEquals("1", app.returnString(1));
      assertEquals("7", app.returnString(7));
     }
}