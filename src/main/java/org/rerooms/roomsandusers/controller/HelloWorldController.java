package org.rerooms.roomsandusers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/helloWorld")
    public String getHelloWorldMessage() {
        return "Hello, World!";
    }
}
