package com.example.sam.puggy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Sam on 30/06/2017.
 */

public class Wheel {

    ArrayList<Symbol> wheel;
    String holdCheck;
    String nudgeCheck;

    public Wheel(){
        wheel = new ArrayList<Symbol>();
        holdCheck = "no";
        nudgeCheck = "no";
        populate();
    }

    public String getHoldCheck() {
        return holdCheck;
    }

    public void setHoldCheck(String holdCheck) {
        this.holdCheck = holdCheck;
    }

    public String getNudgeCheck() {
        return nudgeCheck;
    }

    public void setNudgeCheck(String nudgeCheck) {
        this.nudgeCheck = nudgeCheck;
    }

    public void populate(){
        for (Symbol symbol : Symbol.values()){
            wheel.add(symbol);
        }
    }

    public void spin(){
        if (holdCheck.equals("no")) {
            Random rand = new Random();
            int spins = rand.nextInt(wheel.size());
            Collections.rotate(wheel, spins);
        }
    }

    public Symbol result(){
        return wheel.get(0);
    }

    public Symbol run(){
        if (nudgeCheck.equals("no")) {
            spin();
            return result();
        }
        else {
            return wheel.get(1);
        }
    }



}
