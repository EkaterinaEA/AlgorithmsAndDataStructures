package com.krasnova.Iterator.raskachka;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        a = sc.nextDouble();
        System.out.println("Enter b:");
        b = sc.nextDouble();
        System.out.println("Enter c:");
        c = sc.nextDouble();

        double d = Math.pow(b,2) - 4*c*a;

        double x1 = (-b + Math.sqrt(d))/(2*a);
        double x2 = (-b - Math.sqrt(d))/(2*a);

        if (d < 0) {
            System.out.println("The equation has no solutions");
        }
        if (d == 0) {
            System.out.println("Equation a*x*x + b*x + c = 0 solution: " + x1);
        }
        if (d > 0){
            System.out.println("Equation a*x*x + b*x + c = 0 solutions: " + x1 + ", " + x2);
        }
    }
}
