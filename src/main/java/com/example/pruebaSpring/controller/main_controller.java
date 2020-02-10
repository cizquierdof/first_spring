package com.example.pruebaSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * main_controller
 */
@Controller
public class main_controller {

    //@GetMapping("/hola/{name}")
    @GetMapping("/")
    @ResponseBody
    public String holaMundo(@RequestParam("nombre") String name,
                            @RequestParam("edad") Integer edad){
        //model.addAttribute("name", name);
        return "hola "+name+" tienes "+ edad+" años";
    }
}