/**
 * Created by JingyunYang on 2018/2/5.
 */

public class Validator {

     int validate(String inputPassword){
            int countCorrectRule = 0;                 // count for correct rules
            if (!inputPassword.equals( "password"))   // rule 1: check if password is "password"
                countCorrectRule++;
            if(inputPassword.length() >= 7)           //rule 2: check if length of password >= 8
                countCorrectRule++;
            return countCorrectRule;
        }




}
