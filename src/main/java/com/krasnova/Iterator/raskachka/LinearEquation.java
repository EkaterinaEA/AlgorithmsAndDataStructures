package com.krasnova.Iterator.raskachka;

import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        double a;
        double b;

        Scanner scA = new Scanner(System.in);
        System.out.println("Enter a:");
        a = scA.nextDouble();
        Scanner scB = new Scanner(System.in);
        System.out.println("Enter b:");
        b = scB.nextDouble();

        double x = - (b/a);

        System.out.println("Equation a*x + b = 0 solution: " + x);
    }
}
