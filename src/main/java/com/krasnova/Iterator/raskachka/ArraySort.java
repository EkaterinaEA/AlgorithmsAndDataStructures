package com.krasnova.Iterator.raskachka;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        int array[] = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три целых попарно неравных между собой числа: ");
        for (int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + ", ");
        }
    }
}
