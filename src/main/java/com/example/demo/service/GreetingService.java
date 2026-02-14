package com.example.demo.service;

import com.example.demo.model.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    
    public Greeting createGreeting(String name) {
        String message = String.format("Hello %s!", name);
        return new Greeting(message);
    }
}
