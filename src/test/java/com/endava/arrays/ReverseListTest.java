package com.endava.arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class ReverseListTest {

    private ReverseList reverseList = new ReverseList();

    @Test
    public void reverseAnArray() {
        int[] input = new int[]{1, 2, 3, 4};
        int[] result = reverseList.reverseAnArray(input);

        assertNotNull(result);
        assertArrayEquals(new int[]{4, 3, 2, 1}, result);
    }

    @Test
    public void reverseAnArrayInPlace(){
        int[] input = new int[]{1, 2, 3, 4, 5};
        reverseList.reverseAnArrayInPlace(input);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input);
    }
}