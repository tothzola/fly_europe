package ro.zoltan.toth.fly_europe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"/"})
    public String homePage() {
        return "index";
    }

    @GetMapping("/403")
    public String error403() {
        return "error/403";
    }

}
