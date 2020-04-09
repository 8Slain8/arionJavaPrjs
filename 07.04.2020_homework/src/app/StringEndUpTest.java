package app;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringEndUpTest {
    @Test
    public void TestString1(){
        String str = "Hello";
        StringEndUp c = new StringEndUp();
        //assertNotNull(c.endUp(str));
        assertEquals("HeLLO", c);
    }
}
