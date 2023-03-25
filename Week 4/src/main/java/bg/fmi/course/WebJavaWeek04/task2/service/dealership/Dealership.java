package bg.fmi.course.WebJavaWeek04.task2.service.dealership;

import bg.fmi.course.WebJavaWeek04.task1.model.car.Car;
import bg.fmi.course.WebJavaWeek04.task1.model.invoice.Invoice;
import bg.fmi.course.WebJavaWeek04.task2.service.CarService;
import bg.fmi.course.WebJavaWeek04.task2.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class Dealership {
    private final String dealershipName;
    private final CarService carService;
    private final InvoiceService invoiceService;
    private final Map<String, Integer> carsSoldByMake;

    @Autowired
    public Dealership(@Value("string") String dealershipName, @Qualifier("carService") CarService carService,
                      @Qualifier("invoiceService") InvoiceService invoiceService) {
        this.dealershipName = dealershipName;
        this.carService = carService;
        this.invoiceService = invoiceService;
        this.carsSoldByMake = new HashMap<>();
        carService.getAllCars()
            .forEach(c -> carsSoldByMake.put(c.getMake(), 0));
    }

    public boolean addCar(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("...");
        }

        carsSoldByMake.put(car.getMake(), 0);
        return carService.addCar(car);
    }

    public boolean removeCar(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("...");
        }

        carsSoldByMake.remove(car.getMake());
        return carService.removeCar(car);
    }

    public List<Car> searchCars(String make, String model, int year, double price) {
        return carService.searchCars(make, model, year, price);
    }

    public Invoice sellCar(Car car, String customerName, double taxRate) {
        if (!carsSoldByMake.containsKey(car.getMake())) {
            return null;
        }

        carsSoldByMake.put(car.getMake(), carsSoldByMake.get(car.getMake() + 1));
        return new Invoice(customerName, new Date(), car, car.getPrice(), taxRate);
    }

    public void printInvoice(Invoice invoice) {
        System.out.println(invoice + " with the final price tag plus taxes " + invoice);
    }

    public Map<String, Integer> getSalesByMake() {
        return carsSoldByMake;
    }

    public double getTotalRevenue() {
        return invoiceService.getInvoiceHistory().stream()
            .map(Invoice::getTotalPrice)
            .reduce(0., Double::sum);
    }
}