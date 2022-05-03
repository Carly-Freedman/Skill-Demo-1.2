import static org.junit.Assert.*; 
import org.junit.*;

public class DemoTest {
    @Test
    public void divisionTest(){
        assertEquals("undefined", Demo.division(5, 0));
    }
}
