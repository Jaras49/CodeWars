package com.large.factorials;
import java.math.BigInteger;
import java.util.stream.IntStream;

public class Kata
{

    public static String Factorial(int n) {

        if (n < 0) {
            return null;
        }

        String result = IntStream.rangeClosed(2, n)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, (x, y) -> x.multiply(y))
                .toString();

        return result;
    }
}