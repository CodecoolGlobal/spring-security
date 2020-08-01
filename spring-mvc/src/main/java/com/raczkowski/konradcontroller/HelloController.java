package com.raczkowski.konradcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class HelloController {

    @GetMapping("/sayHello")
    @ResponseBody
    public String sayHello(){
        return "Hello";
    }

    @GetMapping("/getNames")
    @ResponseBody
    public List<String> getNames(){
        return Stream.of("Adam", "przemek")
                .collect(Collectors.toList());
    }

    @GetMapping("/getNames/{letter}")
    @ResponseBody
    public List<String> getNamesStartsWithLetter(@PathVariable String letter) {
        return Stream.of("Adam", "przemek")
                .filter(name -> name.startsWith(letter))
                .collect(Collectors.toList());
    }

}
