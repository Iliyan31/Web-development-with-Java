package bg.uni.fmi.lab03.repository;

import bg.uni.fmi.lab03.car.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarRepository {
    private final List<Car> carList;

    public CarRepository(List<Car> carList) {
        this.carList = carList;
    }

    public boolean addCar(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("The given car cannot be null");
        }
        return carList.add(car);
    }

    public boolean removeCar(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("The given car cannot be null");
        }

        return carList.remove(car);
    }

    public List<Car> searchCars(String make, String model, int year, double price) {
        Car car = Car.builder().setMake(make).setModel(model).setYear(year).setPrice(price).build();

        return carList.stream()
            .filter(c -> c.equals(car))
            .collect(Collectors.toList());
    }

    public List<Car> getAllCars() {
        return carList;
    }
}