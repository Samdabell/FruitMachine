package com.example.sam.puggy;

/**
 * Created by Sam on 30/06/2017.
 */

public class Player {

    String name;
    int money;

    public Player(String name, int money){
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void payMoney(int amount){
        this.money -= amount;
    }

    public void receiveMoney(int amount){
        this.money += amount;
    }
}
