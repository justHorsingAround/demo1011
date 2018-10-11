import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class MainTest {
    @Test
    public void TestIfNumberIsCorrect(){
        Demo1011 d = new Demo1011();
        assertEquals(3, d.returnANumber());
    }


}
