package bg.uni.fmi.lab03.service;

import bg.uni.fmi.lab03.car.Car;
import bg.uni.fmi.lab03.repository.CarRepository;

import java.util.List;

public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public boolean addCar(Car car) {
        return carRepository.addCar(car);
    }

    public boolean removeCar(Car car) {
        return carRepository.removeCar(car);
    }

    public List<Car> searchCars(String make, String model, int year, double price) {
        return carRepository.searchCars(make, model, year, price);
    }

    public List<Car> getAllCars() {
        return carRepository.getAllCars();
    }
}