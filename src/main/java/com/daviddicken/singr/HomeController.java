package com.daviddicken.singr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
class HomeController {
    @GetMapping("/")
    public String showHome(){
        return "home";
    }

    @GetMapping("/hello")
    public String showHello(){
        return "hello";
    }

    @GetMapping("/capitalize/{potato}")
    public String makeBig(Model m, @PathVariable String potato){
        m.addAttribute("potato", potato.toUpperCase());

        return "bigWords";
    }
}
