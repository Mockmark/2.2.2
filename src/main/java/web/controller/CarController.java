package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;
import web.Service;

import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(name = "count", required = false) Integer count,
                               ModelMap model) {
        List<Car> cars = Service.getCarsList(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
