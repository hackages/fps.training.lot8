package io.hackages.learning.fizbuzz;

public class Exercice01 {
    static public String countInLatin(Integer myNumber) {
        StringBuffer result = new StringBuffer();
        Integer number = myNumber;
            while (number >= 1000)  {
                result.append("M");
                number = number - 1000;
            }
            while (number >= 500) {
                result.append("D");
                number = number - 500;
            }
            while (number >= 100)  {
                result.append("C");
                number = number - 100;
            }
            while (number >= 50)  {
                result.append("L");
                number = number - 50;
            }
            while (number >= 10) {
                result.append("X");
                number = number - 10;
            }
            while (number >= 9) {
                result.append("IX");
                number = number - 9;
            }
            while (number >= 5)  {
                result.append("V");
                number = number - 5;
            }
            while (number >= 4)  {
                result.append("IV");
                number = number - 4;
            }
            while (number >= 1)  {
                result.append("I");
                number = number - 1;
            }
       //}
        return result.toString();
    }
}
