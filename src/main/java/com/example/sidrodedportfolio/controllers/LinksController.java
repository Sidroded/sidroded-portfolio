package com.example.sidrodedportfolio.controllers;

import com.example.sidrodedportfolio.database.repository.LinkRepository;
import com.example.sidrodedportfolio.models.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class LinksController {

    @Autowired
    private LinkRepository linkRepository;

    @GetMapping("/links")
    public String links(Model model) {
        List<Link> links = linkRepository.findAll();
        model.addAttribute("links", links);
        return "links-main";
    }
}
