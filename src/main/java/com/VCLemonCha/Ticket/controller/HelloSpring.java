package com.VCLemonCha.Ticket.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpring {
    @RequestMapping("/hello")
    public String print_hello() {
        System.out.println("Print hello in page");
        return "hello";
    }
}
