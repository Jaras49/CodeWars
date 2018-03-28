package com.trianglenumbercheck;

public class TriangleNumbers {

    public static Boolean isTriangleNumber(long number) {

        long countInRow = 0;
        long maxInRow = 1;

        for (int i = 0; i < number; i++) {
            countInRow++;
            if (countInRow == maxInRow) {
                maxInRow++;
                countInRow = 0;
            }
        }
        if (countInRow == 0)
            return true;
        else
            return false;
    }
}