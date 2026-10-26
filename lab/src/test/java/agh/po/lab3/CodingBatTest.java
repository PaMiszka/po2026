package agh.po.lab3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodingBatTest {
    @Test
    public void testSleepIn() {
        CodingBat cb = new CodingBat();
        assertTrue(cb.sleepIn(false, false));
        assertFalse(cb.sleepIn(true, false));
        assertTrue(cb.sleepIn(false, true));
    }

    @Test
    public void testMonkeyTrouble() {
        CodingBat cb = new CodingBat();
        assertTrue(cb.monkeyTrouble(true, true));
        assertTrue(cb.monkeyTrouble(false, false));
        assertFalse(cb.monkeyTrouble(true, false));
    }

    @Test
    public void testCountEvens() {
        CodingBat cb = new CodingBat();
        assertEquals(3, cb.countEvens(new int[]{2, 1, 2, 3, 4}));
        assertEquals(3, cb.countEvens(new int[]{2, 2, 0}));
        assertEquals(0, cb.countEvens(new int[]{1, 3, 5}));
    }

    @Test
    public void testHelloName() {
        CodingBat cb = new CodingBat();
        assertEquals("Hello Alan!", cb.helloName("Alan"));
        assertEquals("Hello Mateusz!", cb.helloName("Mateusz"));
        assertEquals("Hello Wojtek!", cb.helloName("Wojtek"));
    }

}