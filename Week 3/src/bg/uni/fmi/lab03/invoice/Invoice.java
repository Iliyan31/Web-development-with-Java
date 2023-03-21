package bg.uni.fmi.lab03.invoice;

import bg.uni.fmi.lab03.car.Car;

import java.util.Date;
import java.util.Objects;

public class Invoice {
    private static final int PERCENTS = 100;
    private String name;
    private Date date;
    private Car car;
    private double salesPrice;
    private double taxRate;

    // Add validation
    public Invoice(String name, Date date, Car car, double salesPrice, double taxRate) {
        this.name = name;
        this.date = date;
        this.car = car;
        this.salesPrice = salesPrice;
        this.taxRate = taxRate;
    }

    public String name() {
        return name;
    }

    public Date date() {
        return date;
    }

    public Car car() {
        return car;
    }

    public double salesPrice() {
        return salesPrice;
    }

    public double taxRate() {
        return taxRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTotalPrice() {
        return ((taxRate + PERCENTS) / PERCENTS) * salesPrice;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Invoice) obj;
        return Objects.equals(this.name, that.name) &&
            Objects.equals(this.date, that.date) &&
            Objects.equals(this.car, that.car) &&
            Double.doubleToLongBits(this.salesPrice) == Double.doubleToLongBits(that.salesPrice) &&
            Double.doubleToLongBits(this.taxRate) == Double.doubleToLongBits(that.taxRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, car, salesPrice, taxRate);
    }

    @Override
    public String toString() {
        return "Invoice[" +
            "name=" + name + ", " +
            "date=" + date + ", " +
            "car=" + car + ", " +
            "salesPrice=" + salesPrice + ", " +
            "taxRate=" + taxRate + ']';
    }
}