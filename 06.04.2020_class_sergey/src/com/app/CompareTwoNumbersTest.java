package com.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompareTwoNumbersTest {

    @Test
    public void TestCompareTwoNumbers1(){
        CompareTwoNumbers c = new CompareTwoNumbers();
        boolean b = c.compareNumbers(10,5);
        assertTrue(b);

    }
    @Test
    public void TestCompareTwoNumbers2(){
        CompareTwoNumbers c = new CompareTwoNumbers();
        boolean b = c.compareNumbers(10,20);
        assertFalse(b);
    }
    @Test
    public void TestCompareTwoNumbers3(){
        CompareTwoNumbers c = new CompareTwoNumbers();
        boolean b = c.compareNumbers(10,10);
        assertTrue(b);

    }
    @Test
    public void testConcat(){
        CompareTwoNumbers c = new CompareTwoNumbers();
        String concat = c.concat("aa", "bb");

        assertEquals("concat", concat.equalsIgnoreCase("aabb"));
        assertEquals("concat", concat.length()==4);
    }

    @Test
    public void testPersonCreation(){
        String firstNameAndLastName = "piotr;ivanov";
        Person p = Person.createPerson(firstNameAndLastName);
        assertNotNull(p);
        assertEquals("first name", "piotr", p.getFirstName());
        assertEquals("first name", "ivanov", p.getLastName());



    }
}
