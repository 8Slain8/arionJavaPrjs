package app;

import org.junit.Test;

import static org.junit.Assert.*;

public class WeekdayTest {

    @Test
    public void TestSleepIn1(){
        Weekday c = new Weekday();
        boolean b = c.sleepIn(false,false);
        assertTrue(b);
    }
    @Test
    public void TestSleepIn2(){
        Weekday c = new Weekday();
        boolean b = c.sleepIn(true,false);
        assertFalse(b);
    }
    @Test
    public void TestSleepIn3(){
        Weekday c = new Weekday();
        boolean b = c.sleepIn(false,true);
        assertTrue(b);
    }
}
