package com.example.lab03;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathService {
    @RequestMapping("/add/{a}/{b}")
    public double add(@PathVariable("a") double a, @PathVariable("b") double b) {
        return a + b;
    }

    @RequestMapping("/minus/{a}/{b}")
    public double minus(@PathVariable("a") double a, @PathVariable("b") double b) {
        return a - b;
    }

    @RequestMapping("/multiply")
    public double multiply(@RequestParam("num1") double a, @RequestParam("num2") double b) {
        return a * b;
    }

    @RequestMapping("/divide")
    public double divide(@RequestParam("num1") double a, @RequestParam("num2") double b) {
        return a / b;
    }
}
