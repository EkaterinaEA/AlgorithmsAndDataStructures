package com.krasnova.raskachka;

import java.util.Scanner;

public class HalfModule {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите положительное чётное число: ");
        n = sc.nextInt();

        while (n<0 || n%2 != 0){
            System.out.println("Введите положительное чётное число: ");
            n = sc.nextInt();
        }

        int array[] = new int [n];
        for (int i=0; i<array.length; i++){
            array[i] =(int) Math.ceil(((Math.random())*10))-6;
        }
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i<(array.length)/2; i++){
            sum1 = sum1 + Math.abs(array[i]);
        }
        for (int i = (array.length)/2; i<array.length; i++){
            sum2 = sum2 + Math.abs(array[i]);
        }

        System.out.println("\n" + sum1 + " " + sum2);

        if (sum1>sum2){
            System.out.println("Сумма модулей первой половины массива больше");
        } else if(sum1<sum2){
            System.out.println("Сумма модулей второй половины массива больше");
        } else System.out.println("Сумма модулей первой и второй половин массива равны");

    }
}
