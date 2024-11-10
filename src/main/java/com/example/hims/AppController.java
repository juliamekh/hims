package com.example.hims;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home_page";
    }

    @GetMapping("/about_page")
    public String about() {
        return "about_page";
    }

    @GetMapping("/contact_page")
    public String contact() {
        return "contact_page";
    }

    @GetMapping("/services_page")
    public String services() {
        return "services_page";
    }

    @GetMapping("/doctors_page")
    public String doctors() {
        return "doctors_page";
    }

    @GetMapping("/search_page")
    public String search() {
        return "search_page";
    }

    @GetMapping("/login_page")
    public String login() {
        return "login_page";
    }
}
