package bg.uni.fmi.lab01.tasks.task5;

public class Task5 {
    private static int getShiftFromPositiveGreaterThanStrLength(int shift, int stringLength) {
        while (shift > stringLength) {
            shift -= stringLength;
        }
        return shift;
    }
    private static int getShiftFromNegative(int negativeShift, int stringLength) {
        while (negativeShift < stringLength) {
            negativeShift += stringLength;
        }

        return negativeShift;
    }
    public static String caeserCypherAlgorithm(String word, int shift) {
        if (word == null || word.isEmpty() || word.isBlank()) {
            throw new IllegalArgumentException("The given word cannot be null, empty or blank!");
        }

        if (shift == 0 || shift % word.length() == 0) {
            return word;
        }

        if (shift < 0) {
            shift = getShiftFromNegative(shift, word.length());
        }

        if (shift > word.length()) {
            shift = getShiftFromPositiveGreaterThanStrLength(shift, word.length());
        }

        StringBuilder newWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (i + shift < word.length()) {
                newWord.append(word.charAt(i + shift));
            } else {
                newWord.append(word.charAt((i + shift) - word.length()));
            }
        }

        return newWord.toString();
    }

    public static void main(String[] args) {
        System.out.println(caeserCypherAlgorithm("abcdef", -200));
    }
}