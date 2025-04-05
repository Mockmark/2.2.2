package web;

import java.util.ArrayList;
import java.util.List;

public class Service {
    public static List<Car> getCarsList(Integer count) {
        List<Car> allCars = Car.getAllCars();
        List<Car> carsList = new ArrayList<>();
        if (count == null) {
            carsList = allCars;
        } else {
            for (int i = 0; i < count && i < allCars.size(); i++) {
                carsList.add(allCars.get(i));
            }
        }
        return carsList;
    }
}
