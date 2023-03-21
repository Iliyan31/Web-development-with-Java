package bg.uni.fmi.lab01.tasks.task9;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FMIDate {
    private static final int CENTURY = 100;
    private final int year;
    private final int month;
    private final int day;

    public FMIDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean isLeapYear() {
        LocalDate localDate = LocalDate.of(year, month, day);
        return localDate.isLeapYear();
    }

    public int getCentury() {
        if (year % CENTURY == 0) {
            return year / CENTURY;
        }

        return (year / CENTURY) + 1;
    }

    public int getDaysDifference(FMIDate other) {
        LocalDate myLocalDate = LocalDate.of(year, month, day);
        LocalDate otherLocalDate = LocalDate.of(other.year, other.month, other.day);
        return Long.valueOf(Math.abs(ChronoUnit.DAYS.between(myLocalDate, otherLocalDate))).intValue();
    }

    public void printInfo() {
        System.out.print(year + " " + month + " " + day + " - " + getCentury() + "th century.");
        if (isLeapYear()) {
            System.out.print("It is a LEAP year.\n");
        }
    }

    public static void main(String[] args) {
        FMIDate fmiDate = new FMIDate(2024, 4, 30);
        fmiDate.printInfo();
    }
}