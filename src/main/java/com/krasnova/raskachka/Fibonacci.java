package com.krasnova.raskachka;

public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;

        System.out.print(n1 + " " + n2 + " ");

        for (int i=0; i<9; i++){
            int count = n1 + n2;
            n1 = n2;
            n2 = count;
            System.out.print(count + " ");
        }
    }
}
