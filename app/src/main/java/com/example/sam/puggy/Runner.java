package com.example.sam.puggy;

/**
 * Created by Sam on 30/06/2017.
 */

public class Runner {
    public static void main(String[] args) {
        Interface.askName();
        String name = Interface.inputString();
        Interface.askMoney();
        int money = Interface.inputInt();

        Player player = new Player(name, money);
        Game game = new Game(player);

        while (game.getReplay().equals("yes")) {
            game.play();
        }
    }
}
