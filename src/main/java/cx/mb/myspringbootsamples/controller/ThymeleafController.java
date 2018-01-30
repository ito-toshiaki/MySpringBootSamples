package cx.mb.myspringbootsamples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/thymeleaf")
public class ThymeleafController {

    @RequestMapping(value = "/json")
    public String json(Model model) {

        List<String> params = new ArrayList<>();
        List<Integer> values = new ArrayList<>();

        params.add("ONE");
        params.add("TWO");
        params.add("THREE");
        params.add("FOUR");
        params.add("FIVE");

        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);

        model.addAttribute("params", params);
        model.addAttribute("values", values);

        return "/thymeleaf/json";
    }
}
