package com.uni.ds;

/**Bubble Sort Implementation */
public class BubbleSort {
    
    static void sort(int[] array) {
        int n = array.length;
        while(true) {
            boolean swapped = false;
            for(int i = 0; i< n -1; i++) {
                if(array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }

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

    public static void main(String[] args) {
        
        int[] array = {10, 2, 44, 5, 7, 92, 15, 9};
        System.out.println("Array before Bubble Sort :");
        print(array);
        sort(array);
        System.out.println("Array after Bubble Sort :");
        print(array);
    }
    
}
