package com.example.jingyunyang.csci3130_a2_3;

/**
 * Created by JingyunYang on 2018/2/7.
 */

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import com.example.jingyunyang.csci3130_a2_3.Validator_1;


public class JUnitTest_1 {

    static Validator_1 validator;
    @BeforeClass
    public static void init()
    {
        validator = new Validator_1();
    }
    // test for the sume of ruleArray
    @Test
    public void r1IsCorrect()
    {
        //test if "password"
        assertEquals(validator.validate(validator.getArrary("password")),1);
        assertEquals(validator.validate(validator.getArrary("passwor1")),2);
    }

    @Test
    public void r2IsCorrect()
    {
        //if length >= 8
        assertEquals(validator.validate(validator.getArrary("passwor1")),2);
        assertEquals(validator.validate(validator.getArrary("passwor")),1);
    }

    // test for each rule
    @Test
    public void r3IsCorrect()
    {
        //test if "password"
        assertEquals(validator.getArrary("password")[0],0);
        assertEquals(validator.getArrary("passwor1")[0],1);
    }

    @Test
    public void r4IsCorrect()
    {
        //if length >= 8
        assertEquals(validator.getArrary("passwor")[1],0);
        assertEquals(validator.getArrary("passwordd")[1],1);
    }


}
