package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    public int throwDice() {
        return ThreadLocalRandom.current().nextInt(1, 7);
    }
}
