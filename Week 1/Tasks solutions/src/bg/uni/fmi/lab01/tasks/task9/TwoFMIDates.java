package bg.uni.fmi.lab01.tasks.task9;

import java.util.Scanner;

public class TwoFMIDates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the year of the first date: ");
        int firstYear = in.nextInt();

        System.out.println("Please enter the month of the first date: ");
        int firstMonth = in.nextInt();

        System.out.println("Please enter the days of the first date: ");
        int firstDays = in.nextInt();

        System.out.println("Please enter the year of the second date: ");
        int secondYear = in.nextInt();

        System.out.println("Please enter the month of the second date: ");
        int secondMonth = in.nextInt();

        System.out.println("Please enter the days of the second date: ");
        int secondDays = in.nextInt();

        FMIDate fmiDateFirst = new FMIDate(firstYear, firstMonth, firstDays);
        FMIDate fmiDateSecond = new FMIDate(secondYear, secondMonth, secondDays);

        System.out.println(fmiDateFirst.getDaysDifference(fmiDateSecond));
        fmiDateFirst.printInfo();
        fmiDateSecond.printInfo();
    }
}