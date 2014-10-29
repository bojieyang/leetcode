package com.leetcode.oj.plus.one;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.leetcode.oj.plus.one.Solution;

public class PlusOneTestCase {

    private static Solution solution;

    @BeforeClass
    public static void setup() {
        solution = new Solution();
    }

    @Test
    public void testZero() {
        int[] digits = { 0 };

        int[] result = solution.plusOne(digits);
        assertEquals("should be 1", 1, result[0]);
    }

    @Test
    public void testNight() {
        int[] digits = { 9 };
        int[] result = solution.plusOne(digits);
        assertEquals("should be 2", 2, result.length);
        assertEquals("should be 1", 1, result[0]);
        assertEquals("should be 0", 0, result[1]);
    }

}
