package com.krasnova.Iterator.raskachka;

public class Array12 {
    public static void main(String[] args) {
        int array[] = new int[12];
        int first = 0;
        int second = 0;

        for (int i=0; i<array.length; i++){

            int n = (int) Math.ceil(((Math.random())*20))-10;

            if (n != 0 || first < 6 || second < 6) {
                if (n>0) first++;
                if (n<0) second++;
            } else while (n == 0 || first > 6 || second > 6) {
                n = (int) Math.ceil(((Math.random())*20))-10;
            };

            array[i] = n;
            System.out.print(array[i] + " ");
        }
    }
}
