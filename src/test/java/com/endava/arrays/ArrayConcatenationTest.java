package com.endava.arrays;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ArrayConcatenationTest {

    private ArrayConcatenation arrayConcatenation = new ArrayConcatenation();

    @Test
    public void concatenateArrays() {
        int[] firstArray = new int[]{1, 2, 3, 4};
        int[] secondArray = new int[]{11, 22, 33};

        int[] result = arrayConcatenation.concatenateArrays(firstArray, secondArray);

        assertNotNull(result);
        assertEquals(7, result.length);
        assertArrayEquals(new int[]{1, 2, 3, 4, 11, 22, 33}, result);
    }

    @Test
    public void concatenateArraysWithEmptySecondArray() {
        int[] firstArray = new int[]{1, 2, 3, 4};
        int[] secondArray = new int[]{};

        int[] result = arrayConcatenation.concatenateArrays(firstArray, secondArray);

        assertNotNull(result);
        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

    @Test
    public void concatenateArraysWithEmptyFirstArray() {
        int[] firstArray = new int[]{};
        int[] secondArray = new int[]{22, 33, 44};

        int[] result = arrayConcatenation.concatenateArrays(firstArray, secondArray);

        assertNotNull(result);
        assertArrayEquals(new int[]{22, 33, 44}, result);
    }

    @Test
    public void concatenateArraysWithTwoEmptyArraya() {
        int[] firstArray = new int[]{};
        int[] secondArray = new int[]{};

        int[] result = arrayConcatenation.concatenateArrays(firstArray, secondArray);

        assertNotNull(result);
        assertArrayEquals(new int[]{}, result);
    }
}