package com.endava.arrays;


public class ReverseList {

    /**
     * Write a function that reverses a list. For example: if inputArray = {1, 2, 3, 4},
     * the output of this function should be: {4, 3, 2, 1}.
     */
    public  int[] reverseAnArray(int[] inputArray) {
        int[] newArray = new int[inputArray.length];

        for (int j = inputArray.length - 1; j >= 0; j--) {
            newArray[inputArray.length - j - 1] = inputArray[j];
        }
        return newArray;
    }

    /**
     * Modify the above method to reverse the input array in place. Instead of crating a new output array,
     * this method should switch the places of the elements and return nothing.
     */
    public void reverseAnArrayInPlace(int[] array) {
        for (int j = array.length - 1; j > array.length / 2; j--) {
            int tempValue = array[j];
            array[j] = array[array.length - j - 1];
            array[array.length - j - 1] = tempValue;
        }
    }
}
