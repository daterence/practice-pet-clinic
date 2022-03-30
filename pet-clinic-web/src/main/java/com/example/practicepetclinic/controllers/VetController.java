package com.example.practicepetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("vets")
@Controller
public class VetController {

    @RequestMapping({"", "index", "index.hmtl"})
    public String listVets() {
        return "vets/index";
    }
}