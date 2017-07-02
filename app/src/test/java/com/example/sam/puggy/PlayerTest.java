package com.example.sam.puggy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sam on 30/06/2017.
 */

public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player("Sam", 100);
    }

    @Test
    public void testGetName() throws Exception {
        assertEquals("Sam", player.getName());
    }

    @Test
    public void testGetMoney() throws Exception {
        assertEquals(100, player.getMoney());

    }

    @Test
    public void testPlayerPay() throws Exception {
        player.payMoney(10);
        assertEquals(90, player.getMoney());
    }

    @Test
    public void testPlayerReceiveMoney() throws Exception {
        player.receiveMoney(10);
        assertEquals(110, player.getMoney());

    }
}
