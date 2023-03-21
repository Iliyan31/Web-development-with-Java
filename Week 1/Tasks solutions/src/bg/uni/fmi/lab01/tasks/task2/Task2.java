package bg.uni.fmi.lab01.tasks.task2;

public class Task2 {
    private static final int NO_SUCH_ELEMENT = -1;

    private static int nthOddElementOfArray(int[] arr ,int index) {
        if (index < 0) {
            throw new IllegalArgumentException("The index cannot be negative!");
        }

        if (index >= arr.length) {
            return NO_SUCH_ELEMENT;
        }

        int counter = 0;
        for (int elem : arr) {
            if (elem % 2 == 1) {
                counter++;
            }

            if (counter == index) {
                return elem;
            }
        }

        return NO_SUCH_ELEMENT;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {5, 3, 8, 1, 9};

        System.out.println(nthOddElementOfArray(arr, 2));
    }
}