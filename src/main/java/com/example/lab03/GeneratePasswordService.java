package com.example.lab03;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneratePasswordService {
    @RequestMapping("/{name}.generate")
    public String generate(@PathVariable("name") String name) {
        double x = Math.random();
        return "Hi, " + name + "\n" + "Your new password is " + Math.floor(x * 1000000) + ".";
    }
}
