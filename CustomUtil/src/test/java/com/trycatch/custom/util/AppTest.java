package com.trycatch.custom.util;

import static org.junit.Assert.assertTrue;

import com.trycatch.custom.util.TokenManager;
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
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public  void testToken()
    {
        System.out.println(TokenManager.createAccessToken());
    }
}
