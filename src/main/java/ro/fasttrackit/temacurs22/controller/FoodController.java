package ro.fasttrackit.temacurs22.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.fasttrackit.temacurs22.service.FoodService;

@Controller
@RequestMapping("foods")
public class FoodController {
    private final FoodService service;

    public FoodController(FoodService service){
        this.service = service;
    }
    @GetMapping
    String getFoodPage(Model model) {
        model.addAttribute("foods", service.getAll());
        return "foods";
    }
}
