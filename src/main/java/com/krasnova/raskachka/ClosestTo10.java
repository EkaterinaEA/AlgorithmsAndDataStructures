package com.krasnova.raskachka;

import java.util.Scanner;

public class ClosestTo10 {
    public static void main(String[] args) {
        double m;
        double n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите m:");
        m = sc.nextDouble();
        System.out.println("Введите n:");
        n = sc.nextDouble();

        if ((Math.abs(10 - m))<(Math.abs(10 - n))){
            System.out.println("Число " + m + " ближе к 10, чем " + n);
        } else System.out.println("Число " + n + " ближе к 10, чем " + m);
    }
}
