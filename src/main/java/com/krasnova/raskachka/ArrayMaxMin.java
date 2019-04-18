package com.krasnova.raskachka;

import java.util.Arrays;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i=0; i<array.length; i++){
            array[i] = (int) (Math.random()*10);
        }
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

        Arrays.sort(array);
        System.out.println("Array min: " + array[0]);
        System.out.println("Array max: " + array[array.length-1]);
    }
}
