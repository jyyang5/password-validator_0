package com.example.jingyunyang.csci3130_a2_3;

/**
 * Created by JingyunYang on 2018/2/7.
 */
import com.example.jingyunyang.csci3130_a2_3.Validator;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitTest {

    static Validator validator;
    @BeforeClass
    public static void init()
    {
        validator = new Validator();
    }

    @Test
    public void r1IsCorrect()
    {
        //test if "password"
        assertEquals(validator.validate("password")[0],0);
    }

    @Test
    public void r2IsCorrect()
    {
        //if length >= 8
        assertEquals(validator.validate("passwor")[1],0);
    }

    @Test
    public void r3IsCorrect()
    {
        //if has a uppercase letter
        assertEquals(validator.validate("Password")[2],1);
    }
    @Test
    public void r4IsCorrect()
    {
        //if has a lowercase letter
        assertEquals(validator.validate("password")[3],1);
    }
    @Test
    public void r5IsCorrect()
    {
        //if has a digit
        assertEquals(validator.validate("pas1s4od")[4],1);
    }

}
