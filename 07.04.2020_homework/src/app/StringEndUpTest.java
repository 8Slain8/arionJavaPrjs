package app;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringEndUpTest {
    @Test
    public void TestString1(){
        String input = "Hello";

        String actual = StringEndUp.endUp(input);

        String expected = "HeLLO";
        assertEquals(expected,actual);
    }
}
