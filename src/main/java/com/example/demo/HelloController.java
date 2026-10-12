package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/hello")
    public Greeting hello() {
        return new Greeting("Bonjour depuis Java 21 !", Runtime.version().feature());
    }

    public record Greeting(String message, int javaVersion) {}
}
