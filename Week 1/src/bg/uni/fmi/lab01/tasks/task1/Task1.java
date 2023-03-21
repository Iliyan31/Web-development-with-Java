package bg.uni.fmi.lab01.tasks.task1;

import java.util.stream.IntStream;

public class Task1 {
    private static final int NO_SUCH_VALUE = -1;

    public static int indexOfFirstOccurrenceInArrayLambda(int[] arr, int value) {
        return IntStream.range(0, arr.length)
            .filter(v -> arr[v] == value)
            .findFirst()
            .orElse(NO_SUCH_VALUE);
    }

    public static int indexOfFirstOccurrenceInArray(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return NO_SUCH_VALUE;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(indexOfFirstOccurrenceInArray(arr, 10));
        System.out.println(indexOfFirstOccurrenceInArrayLambda(arr, 10));
    }
}
