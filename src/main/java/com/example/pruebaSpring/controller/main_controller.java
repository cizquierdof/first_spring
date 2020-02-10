package com.example.pruebaSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * main_controller
 */
@Controller
public class main_controller {

    //@GetMapping("/hola/{name}")
    @GetMapping("")
    @ResponseBody
    
    public String holaMundo(){
                            
        //model.addAttribute("name", name);
        return "hola mundo";
    }

    @GetMapping("/edad")
    @ResponseBody
    
    public String holaMundo(@RequestParam("name") String name,
                            @RequestParam("edad") Integer edad){
        //model.addAttribute("name", name);
        return "hola "+name+" tienes "+ edad+" años";
    }

    @GetMapping("+")
    public ModelAndView helloHTM(){
        ModelAndView respuesta=new ModelAndView("hola");    //objeto hace referencia a la plantilla
        String msg="Hola mundo HTML!";  //contenido 
        respuesta.addObject(("name"), msg); //añade contenido string al objeto respuesta
        return respuesta;
    }
}