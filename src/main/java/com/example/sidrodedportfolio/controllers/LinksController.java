package com.example.sidrodedportfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LinksController {

    @GetMapping("/links")
    public String links(Model model) {
        return "links-main";
    }
}
