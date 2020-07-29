package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.WebConfig;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String carForm(@RequestParam(defaultValue = "en") Locale locale, ModelMap model) {

        if(locale.equals(Locale.forLanguageTag("ru"))){
            model.addAttribute("title", "МАШИНЫ");
        } else{
            model.addAttribute("title", "CARS");
        }
        List<Car> cars = carService.listCars();
        model.addAttribute("cars", cars);
        return "cars";
    }
}
