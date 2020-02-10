package com.example.pruebaSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * main_controller
 */
@Controller
public class main_controller {

    @GetMapping("/hola/{name}")
    public String getPUBLICunit(@PathVariable("name") String name, Model model){
        model.addAttribute("name", name);
        return "hola";
    }
}