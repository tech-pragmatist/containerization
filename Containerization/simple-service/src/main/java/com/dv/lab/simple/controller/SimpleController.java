package com.dv.lab.simple.controller;

import com.dv.lab.simple.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/")
public class SimpleController {

    @Autowired
    private SimpleService simpleService;

    @GetMapping("/hello")
    public String greetings() throws IOException {
        return simpleService.greetings();
    }
}
