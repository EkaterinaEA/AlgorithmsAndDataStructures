package com.krasnova.raskachka;

import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        double a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        a = sc.nextDouble();
        int roundingA = (int) Math.round(a);
        System.out.println("Number " + a + " after rounding: " + roundingA);

    }
}
