package org.example.FirstSpringboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {


    @GetMapping("/hi")
    public String sayHello (){


        return "Hello World";
    }


    @GetMapping("/hi/{name}")
    public String sayHelloName(@PathVariable String name){

        return "Hello "+name;

    }


    @GetMapping("/plus/{num1}/{num2}")
    public int plus(@PathVariable int num1,@PathVariable int num2){


        return (num1+num2);
    }



}
