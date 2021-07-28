package com.uni.ds;

/** Insertion Sort Implementation */
public class InsertionSort {

    static void sort(int[] array) {

        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
                FunctionUtils.swap(array, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {

        int[] array = { 10, 2, 44, 5, 7, 92, 15, 9, 7 };
        System.out.println("Array before Insertion Sort :");
        FunctionUtils.print(array);
        sort(array);
        System.out.println("Array after Insertion Sort :");
        FunctionUtils.print(array);
    }
}
