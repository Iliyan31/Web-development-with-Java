package bg.fmi.course.WebJavaWeek04.task1.service;

import bg.fmi.course.WebJavaWeek04.task1.model.car.Car;
import bg.fmi.course.WebJavaWeek04.task1.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarService(@Qualifier("carRepository") CarRepository carRepository) {
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