package com.example.jingyunyang.csci3130_a2_3;

/**
 * Created by JingyunYang on 2018/2/7.
 */


public class Validator_1 {

    static int[] validate(String inputPassword){
        int correctRuleArray[] = {0, 0, 0};                     // array storing whether rule is correct
        int passedRules = 0;
        if (!inputPassword.equals( "password"))               // rule 1: check if password is "password"
            correctRuleArray[0] = 1;
        if(inputPassword.length() >= 8)                         //rule 2: check if length of password >= 8
            correctRuleArray[1] = 1;
        if(!inputPassword.equals(inputPassword.toLowerCase()))  //rule 3: check if contains an upper case letter
            correctRuleArray[2] = 1;
        return correctRuleArray;
    }


}
