package com.example.sam.puggy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Sam on 30/06/2017.
 */

public class Wheel {

    ArrayList<Symbol> wheel;

    public Wheel(){
        wheel = new ArrayList<Symbol>();
        populate();
    }

    public void populate(){
        for (Symbol symbol : Symbol.values()){
            wheel.add(symbol);
        }
    }

    public void spin(){
        Random rand = new Random();
        int spins = rand.nextInt(wheel.size());
        Collections.rotate(wheel, spins);
    }

    public Symbol result(){
        return wheel.get(0);
    }

    public Symbol run(){
        spin();
        return result();
    }



}
