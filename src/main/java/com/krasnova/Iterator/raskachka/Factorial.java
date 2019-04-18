package com.krasnova.Iterator.raskachka;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int n = sc.nextInt();
        int count = 1;
        for (int i =1; i<=n; i++){
            count = count*i;
        }
        System.out.println("Факториал числа " + n + ": " + count);
    }
}
