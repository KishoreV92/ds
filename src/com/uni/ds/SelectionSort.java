package com.uni.ds;

/** Selection sort implementation */
public class SelectionSort {

    static void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for(int j = i + 1; j < n ; j++) {
                if(array[j] < array[min]) {
                    min = j;
                }
            }
            FunctionUtils.swap(array, min, i);
        }
    }

    public static void main(String[] args) {
        
        int[] array = {10, 2, 44, 5, 7, 92, 15, 9, 7};
        System.out.println("Array before Selection Sort :");
        FunctionUtils.print(array);
        sort(array);
        System.out.println("Array after Selection Sort :");
        FunctionUtils.print(array);
    }
}
