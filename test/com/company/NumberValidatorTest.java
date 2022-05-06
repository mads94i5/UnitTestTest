package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberValidatorTest {

    @Test
    public void isEvenNumber() {
        // Arrange
        NumberValidator validator = new NumberValidator();
        // Act
        boolean actual = validator.isEvenNumber(6);
        // Assert
        assertTrue(actual);
    }
}