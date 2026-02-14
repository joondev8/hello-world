package com.example.demo.controller;

import com.example.demo.model.Greeting;
import com.example.demo.service.GreetingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloController.class)
public class HelloControllerTest {
    
    @Autowired
    private MockMvc mockMvc;
    
    @MockBean
    private GreetingService greetingService;
    
    @Test
    public void testHelloWithDefaultName() throws Exception {
        when(greetingService.createGreeting("World"))
            .thenReturn(new Greeting("Hello World!"));
        
        mockMvc.perform(get("/api/hello"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.message").value("Hello World!"));
    }
    
    @Test
    public void testHelloWithCustomName() throws Exception {
        when(greetingService.createGreeting("John"))
            .thenReturn(new Greeting("Hello John!"));
        
        mockMvc.perform(get("/api/hello").param("name", "John"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.message").value("Hello John!"));
    }
}
