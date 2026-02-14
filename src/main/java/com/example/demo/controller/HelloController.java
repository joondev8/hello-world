package com.example.demo.controller;

import com.example.demo.model.Greeting;
import com.example.demo.service.GreetingService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Tag(name = "Hello", description = "Greeting endpoints")
public class HelloController {
    
    @Autowired
    private GreetingService greetingService;
    
    @GetMapping("/hello")
    @Operation(summary = "Get greeting", description = "Returns a greeting message for the provided name")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Greeting returned successfully")
    })
    public Greeting hello(
        @Parameter(description = "Name to greet", example = "John")
        @RequestParam(value = "name", defaultValue = "World") String name) {
        return greetingService.createGreeting(name);
    }
}
