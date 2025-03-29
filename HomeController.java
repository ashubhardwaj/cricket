package com.example.cricketinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("news", new String[]{
            "India defeats Australia in a thrilling ODI match!",
            "Virat Kohli scores a century in the T20 series.",
            "ICC announces new World Cup format for 2027."
        });

        model.addAttribute("schedule", new String[]{
            "India vs England - Apr 5, 2025",
            "Pakistan vs Australia - Apr 10, 2025",
            "New Zealand vs South Africa - Apr 12, 2025"
        });

        model.addAttribute("players", new String[]{
            "Virat Kohli (India)",
            "Babar Azam (Pakistan)",
            "Kane Williamson (New Zealand)",
            "Steve Smith (Australia)"
        });

        return "index";
    }
}
