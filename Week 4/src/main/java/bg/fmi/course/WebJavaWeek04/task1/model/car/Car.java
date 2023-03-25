package bg.fmi.course.WebJavaWeek04.task1.model.car;

import java.util.Objects;

public class Car {
    private final String make;
    private final String model;
    private final int year;
    private final double price;

    private Car(CarBuilder carBuilder) {
        this.make = carBuilder.make;
        this.model = carBuilder.model;
        this.year = carBuilder.year;
        this.price = carBuilder.price;
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Double.compare(car.price, price) == 0 && make.equals(car.make) &&
            model.equals(car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, year, price);
    }

    @Override
    public String toString() {
        return "Car{" +
            "make='" + make + '\'' +
            ", model='" + model + '\'' +
            ", year=" + year +
            ", price=" + price +
            '}';
    }

    public static class CarBuilder {
        private String make;
        private String model;
        private int year;
        private double price;

        public CarBuilder() {
        }

        public CarBuilder setMake(String make) {
            if (make == null || make.isEmpty() || make.isBlank()) {
                return this;
            }
            this.make = make;
            return this;
        }

        public CarBuilder setModel(String model) {
            if (model == null || model.isEmpty() || model.isBlank()) {
                return this;
            }

            this.model = model;
            return this;
        }

        public CarBuilder setYear(int year) {
            if (year == 0) {
                return this;
            }

            this.year = year;
            return this;
        }

        public CarBuilder setPrice(double price) {
            if (price == 0) {
                return this;
            }

            this.price = price;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}