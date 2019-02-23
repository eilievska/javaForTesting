package com.endava.arrays;

import java.util.Arrays;

public class SortedListConcatenation {

    /**
     * Write a function that merges two sorted arrays into a new sorted array. For example,
     * if firstArray = {2, 3, 5} and secondArray = {1, 4, 6}, the resulting array should be
     * {1, 2, 3, 4, 5, 6}.
     *
     * @param firstArray  sorted array
     * @param secondArray sorted array
     * @return sorted, merged array.
     */


    public static int[] concatenateSortedArrays(int[] firstArray, int[] secondArray) {
        int newArray[] = new int[firstArray.length + secondArray.length];
        int j = 0;

        for (; j <= firstArray.length - 1; j++) {
            newArray[j] = firstArray[j];
        }
        for (; j <= newArray.length - 1; j++) {
            newArray[j] = secondArray[j - firstArray.length];
        }
        Arrays.sort(newArray);
        return newArray;
    }
}
