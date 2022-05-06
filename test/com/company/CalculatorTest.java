package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sumOf() {
        // Arrange
        Calculator calc = new Calculator();
        // Act + Assert
        assertThrows(IllegalArgumentException.class, () -> {
           calc.sumOf(Integer.MAX_VALUE - 1, Integer.MAX_VALUE -1);
        });

        /*
        int actual = calc.sumOf(1, 2);
        // Assert
        int expected = 3;
        assertEquals(expected, actual);
        */
    }
}