package com.krasnova.Iterator.raskachka.Calculator;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.subtraction(4, 5));
        System.out.println(calculator.division(20, 5));
        System.out.println(calculator.multiplication(5, 9));
        System.out.println(calculator.exponent(5, 3));
        System.out.println(calculator.factorial(4));
        System.out.println(calculator.remainderDivision(58, 9));
        System.out.println(calculator.module(-8));

    }
}
