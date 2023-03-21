package bg.uni.fmi.lab01.tasks.task8;

import java.util.Arrays;

public enum CarValues {
    FIRST_CATEGORY_VALUE(150),
    SECOND_CATEGORY_VALUE(200),
    THIRD_CATEGORY_VALUE(300),
    FOURTH_CATEGORY_VALUE(500),
    MIN_INCREASE_PERCENTS(20),
    MAX_INCREASE_PERCENTS(45),
    LOWER_HP(80),
    UPPER_HP(140),
    FIRST_CATEGORY(1),
    SECOND_CATEGORY(2),
    THIRD_CATEGORY(3),
    FOURTH_CATEGORY(4),
    FIRST_CATEGORY_MAX_YEAR(8),
    SECOND_CATEGORY_MAX_YEAR(16),
    THIRD_CATEGORY_MAX_YEAR(26);

    private final int value;

    CarValues(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static CarValues getCarValue(int value) {
        return Arrays.stream(values())
            .filter(c -> c.value == value)
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("There is no such value!"));
    }
}