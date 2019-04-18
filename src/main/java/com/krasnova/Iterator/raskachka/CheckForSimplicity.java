package com.krasnova.Iterator.raskachka;

import java.util.Scanner;

public class CheckForSimplicity {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();

        for (int i = 2; i<Math.sqrt(n); i++){
            if (n%i == 0){
                System.out.println("Число " + n + " не является простым");
                break;
            } else {
                System.out.println("Число " + n + " является простым");
                break;
            }
        }
    }
}
