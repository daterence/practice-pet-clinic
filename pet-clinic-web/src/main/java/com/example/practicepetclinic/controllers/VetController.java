package com.example.practicepetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.hmtl"})
    public String listVets() {
        return "vets/index";
    }
}
