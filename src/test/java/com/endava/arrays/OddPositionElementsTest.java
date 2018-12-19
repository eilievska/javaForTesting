package com.endava.arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class OddPositionElementsTest {

    private OddPositionElements oddPositionElements = new OddPositionElements();

    @Test
    public void getArrayOfOddPositions() {
        int[] input = new int[]{2, 5, 3, 1, 6, 9};
        int[] result = oddPositionElements.getArrayOfOddPositions(input);

        assertNotNull(result);
        assertArrayEquals(new int[]{5, 1, 9}, result);
    }

    @Test
    public void testSingleElementArray() {
        int[] input = new int[]{2};
        int[] result = oddPositionElements.getArrayOfOddPositions(input);

        assertNotNull(result);
        assertArrayEquals(new int[0], result);
    }

    @Test
    public void testEmptyArray() {
        int[] input = new int[0];
        int[] result = oddPositionElements.getArrayOfOddPositions(input);

        assertNotNull(result);
        assertArrayEquals(new int[0], result);
    }
}