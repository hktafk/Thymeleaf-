package vn.iotstar.demo_sitemesh_thymeleaf.controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "web/home";
    }
    
    @GetMapping("/web/home")
    public String webHome() {
        return "web/home"; // This handles the /web/home URL
    }
}
