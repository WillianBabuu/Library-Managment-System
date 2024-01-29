package com.kilimo.Library;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.SpringApplication; // Import this line

@RestController
@RequestMapping("/question")
public class QuestionController {

    public static void main(String[] args) {
        SpringApplication.run(QuestionController.class, args);
    }

    @GetMapping
    public String hello(){
        return "Hellow Wolrd";
    } 
}
