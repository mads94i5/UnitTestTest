package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameListTest {
    @Test
    public void testAddName() {
        // Arrange
        NameList nameList = new NameList();
        // Act
        String name = "Mads";
        nameList.addName(name);
        String lastElement = nameList.getNames().get(nameList.getNames().size() - 1);
        // Assert
        assertEquals(name, lastElement);
    }
}