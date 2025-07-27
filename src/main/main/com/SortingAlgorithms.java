package com;

import java.util.Arrays;

/**
 * This class represents the most common sorting algorithms, like Bubble Sort, Quick Sort etc.
 */
public class SortingAlgorithms {

    private static final int[] exampleArray = {5, 1, 4, 9, 0, 8, 6}; //an example array for testing sorting algorithms



    /**
     * Bubble Sort is an easy algorithm, but it has a long runtime complexity in average and worst cases - O(n2)
     * The entire array is sorted in n - 1 passes, where n is an amount of elements in this array
     * @return array
     */
    public static int[] doBubbleSort(int[] array) {
        int temp;
        for(int i = 1; i < array.length; i++) {
            for (int j = 0; j < (array.length - i); j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }






    public static void main(String[] args) {

        System.out.println(Arrays.toString(doBubbleSort(exampleArray)));

    }
}
