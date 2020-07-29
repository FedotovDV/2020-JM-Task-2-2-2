package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String carForm(ModelMap model) {
        List<String> messages = new ArrayList<>();
        model.addAttribute("title", "МАШИНЫ");
        messages.add("Car!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.7 version by jul'20 ");
        model.addAttribute("messages", messages);
        return "cars";
    }
}
