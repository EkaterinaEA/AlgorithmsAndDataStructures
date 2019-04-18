package com.krasnova.raskachka;

import java.util.Scanner;

public class ParityCheck {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        n = sc.nextInt();
        if (n%2 == 0){
            System.out.println("Число " + n + " - чётное");
        } else System.out.println("Число " + n + " - нечётное");
    }
}
