package com.training.practice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcWithPathVarController {

    @RequestMapping("/adds/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b){

        return +a+" + "+b+" is "+(a+b);

    }

    @RequestMapping("/subtracts/{a}/{b}")
    public String subtract(@PathVariable int a, @PathVariable int b){

        return a+" - "+b+" is "+(a-b);
    }

    @RequestMapping("/multiple/{a}/{b}")
    public String multiply(@PathVariable int a, @PathVariable int b){

        return a+" * "+b+" is "+(a*b);
    }

    @RequestMapping("/divide/{a}/{b}")
    public String divide(@PathVariable int a, @PathVariable int b){
        return a+" / "+b+" is "+(a/b);
    }
}
