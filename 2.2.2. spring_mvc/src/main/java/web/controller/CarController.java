package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String carForm(@RequestParam(defaultValue = "en") Locale locale, ModelMap model) {
        List<String> messages = new ArrayList<>();
        System.out.println(locale.toString());
        if(locale.equals(Locale.forLanguageTag("ru"))){
            model.addAttribute("title", "МАШИНЫ");
        } else{
            model.addAttribute("title", "CARS");
        }

        messages.add("Car!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.7 version by jul'20 ");
        model.addAttribute("messages", messages);
        return "cars";
    }
}
