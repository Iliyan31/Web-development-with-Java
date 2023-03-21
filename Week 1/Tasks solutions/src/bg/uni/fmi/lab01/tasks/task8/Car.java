package bg.uni.fmi.lab01.tasks.task8;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private final int horsePower;
    private final int year;

    public Car(String brand, String model, int horsePower, int year) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
        this.year = year;
    }

    public int insuranceCategory() {
        final int yearsDifference = LocalDate.now().minusYears(year).getYear();
        return getCategory(yearsDifference);
    }

    public double insuranceValue() {
        CarValues carValue = CarValues.getCarValue(insuranceCategory());
        switch (carValue) {
            case FIRST_CATEGORY -> {
                return sumInsuranceValue(CarValues.FIRST_CATEGORY_VALUE.getValue());
            }
            case SECOND_CATEGORY -> {
                return sumInsuranceValue(CarValues.SECOND_CATEGORY_VALUE.getValue());
            }
            case THIRD_CATEGORY -> {
                return sumInsuranceValue(CarValues.THIRD_CATEGORY_VALUE.getValue());
            }
            case FOURTH_CATEGORY -> {
                return sumInsuranceValue(CarValues.FOURTH_CATEGORY_VALUE.getValue());
            }
        }

        throw new RuntimeException("There was problem while calculating the car insurance value!");
    }

    private double sumInsuranceValue(int value) {
        if (value < CarValues.LOWER_HP.getValue()) {
            return sumValue(value, CarValues.MIN_INCREASE_PERCENTS.getValue());
        }
        if (value > CarValues.UPPER_HP.getValue()) {
            return sumValue(value, CarValues.MAX_INCREASE_PERCENTS.getValue());
        }

        return value;
    }

    private double sumValue(int value, int increasePercents) {
        return (increasePercents * value) + value;
    }

    private int getCategory(int yearsDifference) {
        if (yearsDifference < CarValues.FIRST_CATEGORY_MAX_YEAR.getValue()) {
            return CarValues.FIRST_CATEGORY.getValue();
        }
        if (yearsDifference < CarValues.SECOND_CATEGORY_MAX_YEAR.getValue()) {
            return CarValues.SECOND_CATEGORY.getValue();
        }
        if (yearsDifference < CarValues.THIRD_CATEGORY_MAX_YEAR.getValue()) {
            return CarValues.THIRD_CATEGORY.getValue();
        }

        return CarValues.FOURTH_CATEGORY.getValue();
    }

    public static void main(String[] args) {
        Car car = new Car("Mercedes-Benz", "S220", 160, 2008);
        System.out.println(car.insuranceCategory());
    }
}