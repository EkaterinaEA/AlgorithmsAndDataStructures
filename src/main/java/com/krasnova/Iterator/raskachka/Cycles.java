package com.krasnova.Iterator.raskachka;

public class Cycles {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < 5; i++){
            System.out.println("Hello, World!");
        }
        while (j<4){
            System.out.println("Hello, World!");
            j++;
        }
        do {
            System.out.println("Hello, World!");
            j++;
        } while (j<4);
    }
}
