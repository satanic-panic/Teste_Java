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
}