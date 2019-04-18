package com.krasnova.raskachka;

public class NumberOfThrees {
    public static void main(String[] args) {
        int a = (int) (Math.random()*900) + 99;
        System.out.println(a);

        int hundreds = a/100;
        int tens = (a-(hundreds*100))/10;
        int units = a - (hundreds*100) - (tens*10);

        if (hundreds > tens && hundreds > units){
            System.out.println("В числе " + a + " наибольшая цифра " + hundreds);
        } else if (tens > hundreds && tens > units){
            System.out.println("В числе " + a + " наибольшая цифра " + tens);
        } else if (units > hundreds && units > tens){
            System.out.println("В числе " + a + " наибольшая цифра " + units);
        }
    }
}
