package bg.uni.fmi.lab01.tasks.task0;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class Task0 {
    private static final int ZERO_ONE_FACTORIAL = 1;
    public static long factorialOfGivenNumberWithLambda(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("The given number is negative and does not have any factorial value!");
        }

        if (number == 0 || number == 1) {
            return ZERO_ONE_FACTORIAL;
        }

        return LongStream.rangeClosed(1, number)
            .reduce(1, (n1, n2) -> n1 * n2);
    }

    public static BigInteger factorialOfGivenNumberWithForLoop(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("The given number is negative and does not have any factorial value!");
        }

        if (number == 0 || number == 1) {
            return BigInteger.ONE;
        }

        BigInteger factorialNumber = BigInteger.ONE;

        for (int i = number; i > 0; i--) {
            factorialNumber = factorialNumber.multiply(BigInteger.valueOf(i));
        }

        return factorialNumber;
    }

    public static void main(String[] args) {
        System.out.println(factorialOfGivenNumberWithForLoop(10));
        System.out.println(factorialOfGivenNumberWithLambda(10));
    }
}