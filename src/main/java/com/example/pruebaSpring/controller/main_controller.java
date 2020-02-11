package com.example.pruebaSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/hola")
    public ModelAndView helloHTM() {
        ModelAndView respuesta = new ModelAndView("hola"); // objeto hace referencia a la plantilla
        String msg = "Hola mundo HTML!"; // contenido
        respuesta.addObject(("name"), msg); // añade contenido string al objeto respuesta
        return respuesta;
    }

    @GetMapping("/calculadora")
    public ModelAndView CalculadoraHTML() {
        ModelAndView modelAndview =new ModelAndView("hola");
        modelAndview.addObject("mensaje", "");
        return modelAndview;
    }

    @PostMapping("/calculadora")
    public ModelAndView calculadoraHTMLPost(
                @RequestParam("op") String op, 
                @RequestParam(name = "op1") Double op1,
                @RequestParam(name = "op2", required = false) Double op2){
                    ModelAndView modelAndView=new ModelAndView("hola");

                    String resultado=calcular(op1,op2,op);

                    modelAndView.addObject("mensaje", "El resultado es: "+resultado);

                    return modelAndView;
                }
    

  /*   @GetMapping("/calculadora")
    public ModelAndView calculadoraHTML() {
        ModelAndView respuesta = new ModelAndView("hola"); // objeto hace referencia a la plantilla
        
        respuesta.addObject(("name"), msg); // añade contenido string al objeto respuesta
        return respuesta;
    } */

    private String calcular(Double op1, Double op2, String op) {
        Double resultado = 0.0;
        String res = "";
        System.out.println(op + " " + op1 + " " + op2);
        switch (op) {
        case "suma":
            resultado = op1 + op2;

            break;
        case "resta":
            resultado = op1 - op2;
            break;
        case "multiplica":
            resultado = op1 * op2;
            break;
        case "divide":
            resultado = op1 / op2;
            break;
        case "raiz":
            resultado = Math.sqrt(op1);
            break;
        default:
            return "Operación no soportada";
        }

        res = resultado.toString();
        return res;

    }

}