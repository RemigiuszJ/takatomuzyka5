package com.example.takatomuzyka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TakatomuzykaController {

    @RequestMapping(value = {"/"})
    public String getArtists() {
        return "index";
    }

}