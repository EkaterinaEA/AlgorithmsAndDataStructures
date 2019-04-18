package com.krasnova.Iterator.raskachka;

public class Sequence2 {
    public static void main(String[] args) {
        int array[] = new int[20];
        int a = 2;
        for (int i=1; i<=array.length; i++){
            System.out.print(a + " ");
            a = a*2;
        }
    }
}
