package com.example.sam.puggy;

/**
 * Created by Sam on 30/06/2017.
 */

public class Money {

    int money;

    public Money(int money){
        this.money = money;
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
