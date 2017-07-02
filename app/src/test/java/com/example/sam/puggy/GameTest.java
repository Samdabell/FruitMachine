package com.example.sam.puggy;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static com.example.sam.puggy.Symbol.BELL;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Sam on 02/07/2017.
 */

public class GameTest {

    Player player;
    Game game;

    @Before
    public void before(){
        player = new Player("Sam", 10);
        game = new Game(player);
    }

    @Test
    public void testWinCheck() throws Exception {
        ArrayList<Symbol> result = new ArrayList<>();
        result.add(BELL);
        result.add(BELL);
        result.add(BELL);
        assertTrue(game.winCheck(result));
    }

    @Test
    public void testPayout() throws Exception {
        game.payout(BELL, 2);
        assertEquals(18, player.getMoney());
        assertEquals(492, game.getMoney().getMoney());
    }
}
