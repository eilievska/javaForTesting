package com.endava.arrays;

import java.util.Arrays;

public class OddPositionElements {

    /**
     * Implement a function that will return only the numbers on an odd position of the input array. For example:
     * inputArray = {2, 5, 3, 1, 6, 9}, the output array will be {5, 1, 9}
     *
     * @param inputArray
     * @return
     */

    public static void main(String[] args) {
        getArrayOfOddPositions(new int[]{78, 12, 13, 11, 45});
    }

    public static int[] getArrayOfOddPositions(int[] inputArray) {

        int outputArray[] = new int[Math.round(inputArray.length / 2)];

        for (int i = 0; i < inputArray.length; i++) {
            if (i % 2 != 0) {
                outputArray[Math.round(i / 2)] = inputArray[i];
            }
        }
        return outputArray;
    }
}