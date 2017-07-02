package com.example.sam.puggy;

import java.util.ArrayList;

import static com.example.sam.puggy.Interface.inputInt;

/**
 * Created by Sam on 30/06/2017.
 */

public class Game {

    Player player;
    ArrayList<Wheel> wheels;
    Money money;
    Wheel wheel1;
    Wheel wheel2;
    Wheel wheel3;
    Interface viewer;
    String replay;

    public Game(Player player){
        this.player = player;
        this.wheels = new ArrayList<>();
        this.money = new Money(500);
        viewer = new Interface();
        replay = "yes";
        populateWheels();
    }

    public Money getMoney() {
        return money;
    }

    public String getReplay() {
        return replay;
    }

    public void setReplay(String replay) {
        this.replay = replay;
    }

    public void populateWheels(){
        wheel1 = new Wheel();
        wheel2 = new Wheel();
        wheel3 = new Wheel();
        wheels.add(wheel1);
        wheels.add(wheel2);
        wheels.add(wheel3);
    }

    public void play() {
        viewer.startMessage();
        int fee = Interface.inputInt();
        if (player.getMoney() < fee) {
            viewer.notEnoughMoney();
            playAgain();
        } else {
            player.payMoney(fee);
            money.receiveMoney(fee);
            viewer.spin();
            ArrayList<Symbol> result = spinWheels();
//        while (winCheck() && money.getMoney() >= calculateWinnings(result.get(0), fee)) {
//            result = spinWheels();
//        }
            viewer.result(result);
            if (winCheck(result)) {
                viewer.winMessage(calculateWinnings(result.get(0), fee));
                payout(result.get(0), fee);
            } else {
                viewer.loseMessage();
            }
            playAgain();
        }
    }

    public ArrayList<Symbol> spinWheels(){
        ArrayList<Symbol> results = new ArrayList<>();
        for (Wheel wheel : wheels){
            results.add(wheel.run());
        }
        return results;
    }

    public boolean winCheck(ArrayList<Symbol> result){
        return (result.get(0) == result.get(1) && result.get(0) == result.get(2));
    }

    public int calculateWinnings(Symbol symbol, int fee){
        return fee * symbol.getMultiplier();
    }

    public void payout(Symbol symbol, int fee){
        int winnings = fee * symbol.getMultiplier();
        player.receiveMoney(winnings);
        money.payMoney(winnings);
    }

    public void playAgain(){
        if (player.getMoney() > 0) {
            viewer.playerMoney(player);
            viewer.askReplay();
            setReplay(Interface.inputString().toLowerCase());
        } else {
            viewer.outOfMoney();
            setReplay("no");
        }
    }
}
