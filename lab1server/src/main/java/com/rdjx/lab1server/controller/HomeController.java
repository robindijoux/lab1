package com.rdjx.lab1server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdjx.lab1server.service.CounterService;

@RestController
public class HomeController {

    @Autowired
    private CounterService counterService;

    @GetMapping("")
    public String getHelloWorld() {
        return "<h1>Hello World " + counterService.incrementCounter() + "</h1>";
    }

    @DeleteMapping("")
    public void resetCounter() {
    }
}
