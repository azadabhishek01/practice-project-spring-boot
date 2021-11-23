package com.training.practice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcWithReqParamController {

    @RequestMapping("/add")
    public String add(@RequestParam int a,@RequestParam int b){

        return +a+" + "+b+" is "+(a+b);
    }

    @RequestMapping("/subtract")
    public String subtract(@RequestParam int a,@RequestParam int b){

        return a+" - "+b+" is "+(a-b);
    }

    @RequestMapping("/multiply")
    public String multiply(@RequestParam int a,@RequestParam int b){

        return a+" * "+b+" is "+(a*b);
    }

    @RequestMapping("/div")
    public String divide(@RequestParam int a,@RequestParam int b){
        return a+" / "+b+" is "+(a/b);
    }
}
