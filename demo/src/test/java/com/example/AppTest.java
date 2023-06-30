package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAdd() {
        assertEquals(8, App.add(5, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, App.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, App.multiply(5, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(5.0 / 3, App.divide(5, 3), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        App.divide(5, 0);
    }
}