package com.example.sam.puggy;

import java.util.ArrayList;
import java.util.Scanner;

import static android.R.id.input;
import static java.lang.Integer.parseInt;

/**
 * Created by Sam on 30/06/2017.
 */

public class Interface {

    static Scanner sc = new Scanner(System.in);

    public static String inputString(){
        return sc.nextLine();
    }

    public static int inputInt(){
        return Integer.parseInt(sc.nextLine());
    }

    public static void askName(){
        System.out.println("Enter your name");
    }

    public static void askMoney(){
        System.out.println("How much money do you have?");
    }

    public void startMessage() {
        System.out.println("Enter the amount you'd like to bet to begin");
    }

    public void spin() {
        System.out.println("Spinning");
    }

    public void result(ArrayList<Symbol> result) {
        System.out.println(result);
    }

    public void winMessage(int winnings) {
        System.out.println("Well done, you won £" + winnings);
    }

    public void loseMessage() {
        System.out.println("Sorry you didn't win this this time");
    }

    public void askReplay() {
        System.out.println("Would you like to play again?");
    }

    public void wrongAnswer() {
        System.out.println("That is not a valid answer, please enter yes or no");
    }

    public void outOfMoney() {
        System.out.println("Sorry you are out of money");
    }

    public void playerMoney(Player player) {
        System.out.println("You have £" + player.getMoney() + " left");
    }

    public void notEnoughMoney() {
        System.out.println("Sorry you do not have enough money to make that bet");
    }
}
