package com.raczkowski.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClientController {

    @GetMapping("/greeting")
    @ResponseBody
    public String greeting() {
        return "Hello there!";
    }
}
