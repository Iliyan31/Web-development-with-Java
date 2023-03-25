package bg.fmi.course.WebJavaWeek04.task2.repository;

import bg.fmi.course.WebJavaWeek04.task1.model.car.Car;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarRepository {
    private final List<Car> carList = new LinkedList<>();

//    public CarRepository(List<Car> carList) {
//        this.carList = carList;
//    }

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