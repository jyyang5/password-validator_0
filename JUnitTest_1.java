package com.example.jingyunyang.csci3130_a2_3;

/**
 * Created by JingyunYang on 2018/2/7.
 */

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import com.example.jingyunyang.csci3130_a2_3.Validator_1;


public class JUnitTest_1 {

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



}
