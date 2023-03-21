package bg.uni.fmi.lab01.tasks.task3;

public class Task3 {
    private static final int HALF_LENGTH = 2;

    public static boolean isPalindrome(String word) {
        if (word == null || word.isEmpty() || word.isBlank()) {
            throw new IllegalArgumentException("The given word cannot be null, empty or blank!");
        }

        for (int i = 0; i < word.length() / HALF_LENGTH; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abc"));
    }
}