package com.example.bookstore.bookstore.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class bookController {


    @GetMapping("/index")
        public String index(){

        return "index";
    }



}
