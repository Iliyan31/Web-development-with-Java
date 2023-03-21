package bg.uni.fmi.lab01.tasks.task4;

public class Task4 {
    private static final String SYMBOL = "*";
    private static final String SPACE = " ";

    public static String printStructure(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException(
                "The given number cannot be negative or zero in order to print the triangle!");
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                if (j != i - 1) {
                    builder.append(SYMBOL + SPACE);
                } else {
                    builder.append(SYMBOL + "\n");
                }
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(printStructure(10));
    }
}
