package app;

import org.junit.Test;
import static org.junit.Assert.*;
public class Diff21Test {
    @Test
    public void TestDiff21_1(){
        Diff21 c = new Diff21();
        int b = c.diff21(20);
        assertEquals(1,b);
    }
    @Test
    public void TestDiff21_2(){
        Diff21 c = new Diff21();
        int b = c.diff21(25);
        assertEquals(8,b);
    }
}
