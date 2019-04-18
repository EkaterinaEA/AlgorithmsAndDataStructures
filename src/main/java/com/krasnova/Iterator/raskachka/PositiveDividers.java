package com.krasnova.Iterator.raskachka;

import java.util.Scanner;

public class PositiveDividers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите положительное натуральное число: ");
        int n = sc.nextInt();
        for (int i=1; i<=n/2; i++){
            if (n%i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
