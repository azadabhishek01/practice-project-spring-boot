package com.training.practice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalController {

    @RequestMapping("/addition")
    public String add(){
        int a = 12;
        int b = 15;

        return String.format("The addition is of %d and %d is = %d ",a,b,(a+b));
    }

    @RequestMapping("/subtraction")
    public String subtract(){
        int c = 200;
        int d = 155;

        return String.format("The subtraction is of %d and %d is = %d ",c,d,(c-d));
    }

    @RequestMapping("/multiplication")
    public String multiply(){
        int c = 5;
        int d = 6;

        return String.format("The multiplication is of %d and %d is = %d ",c,d,(c*d));
    }

    @RequestMapping("/division")
    public String divide(){
        int a = 25;
        int b = 5;
        return String.format("The division is of %d and %d is = %d ",a,b,(a/b));
    }
}
