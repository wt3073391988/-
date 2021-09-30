package com.cain.lesson1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Lesson1Application {

    public static void main(String[] args) {
        SpringApplication.run(Lesson1Application.class, args);
        System.out.println("Web Application Hello World Started Successfully!");
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name",defaultValue = "world") String name){
        return String.format("Hello %s!",name);
    }
}
