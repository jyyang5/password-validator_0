/**
 * Created by JingyunYang on 2018/2/5.
 */

public class Validator2 {

    static int validate(String inputPassword){
            int countCorrectRule = 0;                               // count for correct rules
            if (!inputPassword.equals( "password"))                 // rule 1: check if password is "password"
                countCorrectRule++;
            if(inputPassword.length() >= 7)                         //rule 2: check if length of password >= 8
                countCorrectRule++;
            if(!inputPassword.equals(inputPassword.toLowerCase()))  //rule 3: check if contains an upper case letter
                countCorrectRule++;
            if(!inputPassword.equals(inputPassword.toUpperCase()))  //rule 4: check if contains a lower case letter
                countCorrectRule++;
            if(inputPassword.matches(".*\\d+.*"))                   //rule 5: check if contains a digit
                countCorrectRule++;
            return countCorrectRule;
        }

    public static void main(String[] args) {
        System.out.println(validate("Aaa"));
    }


}
