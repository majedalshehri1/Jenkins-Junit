package com.wakeb;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CacolatorTest {

    @Test
    public void testAddPositiveNumbers() {
        assertEquals(11, Calcolator.add(4, 7));
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-11, Calcolator.add(-3, -8));
    }

    @Test
    public void testAddMixedNumbers() {
        assertEquals(1, Calcolator.add(4, -3));
    }

    @Test
    public void testSubPositiveNumbers() {
        assertEquals(3, Calcolator.sub(7, 4));
    }

    @Test
    public void testSubNegativeNumbers() {
        assertEquals(5, Calcolator.sub(-3, -8));
    }

    @Test
    public void testSubMixedNumbers() {
        assertEquals(7, Calcolator.sub(4, -3));
    }
    // test build trigger "comment" //

}