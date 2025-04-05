package web;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private double price;
    private String color;

    public Car(String model, double price, String color) {
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    static List<Car> getAllCars() {
        Car car1 = new Car("1968 Dodge Charger III", 12.2, "red");
        Car car2 = new Car("1968 Bizzarrini Manta", 13.3, "green");
        Car car3 = new Car("1969 Ferrari 512S Berlinetta Speciale", 14.5, "yellow");
        Car car4 = new Car("1969 Autobianchi Runabout", 15.5, "white");
        Car car5 = new Car("1976 Alfa Romeo Navajo", 16.5, "silver");
        List<Car> allCars = new ArrayList<>();
        allCars.add(car1);
        allCars.add(car2);
        allCars.add(car3);
        allCars.add(car4);
        allCars.add(car5);
        return allCars;
    }
}
