package com.example.sam.puggy;

/**
 * Created by Sam on 30/06/2017.
 */

public enum Symbol {

    CHERRIES(2),
    BELL(4),
    BAR(6),
    SEVENS(7),
    JACKPOT(10);

    int multiplier;

    Symbol(int multiplier){
        this.multiplier = multiplier;
    }

    public int getMultiplier() {
        return multiplier;
    }
}
