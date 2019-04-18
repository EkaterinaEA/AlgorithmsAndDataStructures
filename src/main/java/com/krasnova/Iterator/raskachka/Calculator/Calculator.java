package com.krasnova.Iterator.raskachka.Calculator;

public class Calculator {

    public int subtraction(int a, int b){
        return a - b;
    }

    public double division(int a, int b){
        return a/b;
    }

    public int multiplication(int a, int b){
        return a*b;
    }

    public double exponent(int a, int b){
        return Math.pow(a, b);
    }

    public int factorial(int a){
        int count = 1;
        for (int i =1; i<=a; i++){
            count = count*i;
        }
        return count;
    }

    public double remainderDivision(int a, int b){
        return a%b;
    }

    public int module(int a){
        return Math.abs(a);
    }

}
