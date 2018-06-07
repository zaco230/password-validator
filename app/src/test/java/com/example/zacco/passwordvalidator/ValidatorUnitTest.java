package com.example.zacco.passwordvalidator;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ValidatorUnitTest {

    static String password = "!Password1234";
    static Validator validator;

    @BeforeClass
    public static void init()
    {
        validator = new Validator();
        validator.setPassword(password);
    }

    @Test
    public void addition_isCorrect()
    {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void passwordIsCorrect()
    {
        assertEquals(password, validator.getPassword());
    }

    @Test
    public void passwordPasses()
    {
        assertEquals(5, validator.validate());
    }
    @Test
    public void passwordFails()
    {
        validator.setPassword("password");
        assertEquals(1, validator.validate());
    }
}