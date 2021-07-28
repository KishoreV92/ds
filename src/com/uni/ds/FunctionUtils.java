package com.uni.ds;

public class FunctionUtils {
     
    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static void print(int[] array) {
        for(int i = 0; i< array.length; i++)
            System.out.print(array[i] + " ");
            System.out.println();    
    }
}
