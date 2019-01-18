package com.zb.blackliquid;

import static com.zb.blackliquid.App.isHot;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrueBecauseCoffeeShouldBeHot()
    {
        //assertTrue( true );
        assertTrue(isHot(190));


    }
}
