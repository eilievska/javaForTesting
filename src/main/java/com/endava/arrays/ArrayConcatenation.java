package com.endava.arrays;

public class ArrayConcatenation {

    /**
     * Write a function that will concatenate two lists, one after the other.
     * For example: firstArray = {1, 2, 3, 4}, secondArray = {11, 22, 33}, the resulting array will be:
     * result = {1, 2, 3, 4, 11, 22, 33}.
     *
     * @param firstArray
     * @param secondArray
     * @return concatenated array.
     */

    public static int[] concatenateArrays(int[] firstArray, int[] secondArray) {

        int newArray[] = new int[firstArray.length + secondArray.length];
        int j = 0;

        for (; j <= firstArray.length - 1; j++) {
            newArray[j] = firstArray[j];
        }
        for (; j <= newArray.length - 1; j++) {
            newArray[j] = secondArray[j - firstArray.length];
        }
        return newArray;
    }
}