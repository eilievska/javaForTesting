package com.endava.arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SortedListConcatenationTest {

    private SortedListConcatenation sortedListConcatenation = new SortedListConcatenation();

    @Test
    public void concatenateSortedArrays() {
        int[] firstArray = new int[]{2, 3, 5};
        int[] secondArray = new int[]{1, 4, 6};

        int[] result = sortedListConcatenation.concatenateSortedArrays(firstArray, secondArray);

        assertNotNull(result);
        assertEquals(6, result.length);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, result);
    }

    @Test
    public void concatenateArraysWithEmptySecondArray() {
        int[] firstArray = new int[]{1, 2, 3, 4};
        int[] secondArray = new int[]{};

        int[] result = sortedListConcatenation.concatenateSortedArrays(firstArray, secondArray);

        assertNotNull(result);
        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

    @Test
    public void concatenateArraysWithEmptyFirstArray() {
        int[] firstArray = new int[]{};
        int[] secondArray = new int[]{22, 33, 44};

        int[] result = sortedListConcatenation.concatenateSortedArrays(firstArray, secondArray);

        assertNotNull(result);
        assertArrayEquals(new int[]{22, 33, 44}, result);
    }

    @Test
    public void concatenateArraysWithTwoEmptyArraya() {
        int[] firstArray = new int[]{};
        int[] secondArray = new int[]{};

        int[] result = sortedListConcatenation.concatenateSortedArrays(firstArray, secondArray);

        assertNotNull(result);
        assertArrayEquals(new int[]{}, result);
    }
}