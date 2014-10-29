package com.leetcode.oj.plus.one;

/**
 * Given a non-negative number represented as an array of digits, plus one to the number.<br>
 * The digits are stored such that the most significant digit is at the head of the list.<br>
 */
public class Solution {

    public int[] plusOne(int[] digits) {
        if (null == digits) throw new IllegalArgumentException("digits should not be null.");
        int len = digits.length;
        boolean carry = false;
        if (digits[len - 1] == 9) {
            digits[len - 1] = 0;
            carry = true;
        } else {
            digits[len - 1]++;
        }

        for (int i = len - 2; i >= 0; i--) {
            if (digits[i] == 9 && carry) {
                digits[i] = 0;
                carry = true;

            } else if (digits[i] != 9 && carry) {
                digits[i]++;
                carry = false;
            }

        }

        if (carry) {
            int[] result = new int[len + 1];
            result[0] = 1;
            for (int i = 0; i < len; i++) {
                result[i + 1] = digits[i];
            }
            return result;
        }
        return digits;
    }
}
