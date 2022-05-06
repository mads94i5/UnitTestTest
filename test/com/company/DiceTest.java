package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    @Test
    public void testThrowDice() {
        // Arrange
        Dice dice = new Dice();
        // Act
        int actual = dice.throwDice();
        // Assert
        assertTrue(actual >= 1 && actual <= 6);
    }
}