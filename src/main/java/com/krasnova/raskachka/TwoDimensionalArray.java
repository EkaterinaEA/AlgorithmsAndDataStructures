package com.krasnova.raskachka;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int [][] array = new int[8][5];
        for(int i=0; i<array.length; i++){
            for (int j=0; j<array[0].length; j++){
                array[i][j]=(int)((Math.random())*89 + 10);
            }
        }

        for(int i=0; i<array.length; i++){
            for (int j=0; j<array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
