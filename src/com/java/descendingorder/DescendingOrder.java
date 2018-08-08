package com.java.descendingorder;

import java.util.Arrays;

/**
 * Your task is to make a function that can take any non-negative integer as a argument and return
 * it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
 */

public class DescendingOrder {
    public static int sortDesc(final int num)
    {
        String number = String.valueOf(num);
        char[] digits = number.toCharArray();
        Arrays.sort(digits);
        String result = "";

        for (int i = digits.length -1 ; i >= 0; i--)
        {
            result += digits[i];
        }
        int r = Integer.parseInt(result);
        return r;
    }
}
