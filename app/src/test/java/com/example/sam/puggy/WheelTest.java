package com.example.sam.puggy;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static com.example.sam.puggy.Symbol.BAR;
import static com.example.sam.puggy.Symbol.CHERRIES;
import static org.junit.Assert.assertEquals;

/**
 * Created by Sam on 30/06/2017.
 */

public class WheelTest {
    Wheel wheel;

    @Before
    public void before(){
        wheel = new Wheel();
    }

    @Test
    public void testPopulated() throws Exception {
        assertEquals(CHERRIES, wheel.result());
    }

    @Test
    public void testSpin() throws Exception {
        Wheel spyWheel = Mockito.spy(wheel);
        Mockito.when(spyWheel.run()).thenReturn(BAR);
        assertEquals(BAR, spyWheel.run());
    }
}
