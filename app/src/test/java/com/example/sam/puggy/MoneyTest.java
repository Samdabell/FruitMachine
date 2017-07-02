package com.example.sam.puggy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sam on 30/06/2017.
 */

public class MoneyTest {
    
    Money money;
    
    @Before
    public void before() {
        money = new Money(1000);
    }

    @Test
    public void getAmount() throws Exception {
        assertEquals(1000, money.getMoney());
    }

    @Test
    public void addMoney() throws Exception {
        money.receiveMoney(100);
        assertEquals(1100, money.getMoney());
    }

    @Test
    public void gveMoney() throws Exception {
        money.payMoney(100);
        assertEquals(900, money.getMoney());
    }
}
