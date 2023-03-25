package bg.fmi.course.WebJavaWeek04.task2.controller;

import bg.fmi.course.WebJavaWeek04.task1.model.car.Car;
import bg.fmi.course.WebJavaWeek04.task2.service.dealership.Dealership;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DealershipController {
    private final Dealership dealership;

    @Autowired
    public DealershipController(Dealership dealership) {
        this.dealership = dealership;
    }

    @GetMapping("/cars")
    public List<Car> getAllVehicles() {
        return dealership.searchCars("", "", 0, 0);
    }
}
