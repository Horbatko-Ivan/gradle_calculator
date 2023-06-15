package org.goit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    void setUP() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void sumOfOne() {
        assertEquals(1, sumCalculator.sum(1));
    }
    @Test
    void sumOfThree() {
        assertEquals(6, sumCalculator.sum(3));
    }
    @Test
    void sumOf10() {
        assertNotEquals(50, sumCalculator.sum(10));
    }
    @Test
    void sumError() {
        Exception exception =assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0), "Not have sum of elements");
        assertEquals("IllegalArgumentException", exception.getMessage());
    }
}
