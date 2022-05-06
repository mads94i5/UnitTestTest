package com.company;

public class Calculator {

    public int sumOf(int num1, int num2) {
        if (num1 > 100 || num2 > 100) {
            throw new IllegalArgumentException();
        }
        return num1 + num2;
    }
}
