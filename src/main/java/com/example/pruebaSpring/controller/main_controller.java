package com.example.pruebaSpring.controller;

import org.springframework.beans.factory.annotation.Required;
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

    // @GetMapping("/hola/{name}")
    @GetMapping("")
    @ResponseBody

    public String holaMundo() {

        // model.addAttribute("name", name);
        return "hola mundo";
    }

    @GetMapping("/edad")
    @ResponseBody

    public String holaMundo(@RequestParam("name") String name, @RequestParam("edad") Integer edad) {
        // model.addAttribute("name", name);
        return "hola " + name + " tienes " + edad + " años";
    }

    @GetMapping("+")
    public ModelAndView helloHTM() {
        ModelAndView respuesta = new ModelAndView("hola"); // objeto hace referencia a la plantilla
        String msg = "Hola mundo HTML!"; // contenido
        respuesta.addObject(("name"), msg); // añade contenido string al objeto respuesta
        return respuesta;
    }

    @GetMapping("/calc")
    @ResponseBody
    public String Calculadora(@RequestParam("op") String op, @RequestParam(name = "op1") Double op1,
            @RequestParam(name = "op2", required = false) Double op2) {
        Double resultado = 0.0;
        String res = "";
        System.out.println(op + " " + op1 + " " + op2);
        switch (op) {
        case "mas":
            resultado = op1 + op2;

            break;
        case "-":
            resultado = op1 - op2;
            break;
        case "*":
            resultado = op1 * op2;
            break;
        case "/":
            resultado = op1 / op2;
            break;
        case "sqr":
            resultado = Math.sqrt(op1);
            break;
        default:
            return "Operación no soportada";
        }

        res = resultado.toString();
        return res;

    }

}