package com.coterie.rest_services.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.coterie.rest_services.model.Greetings;
import com.coterie.rest_services.service.DashboardService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.css.Counter;

/**
 * DashboardController
 */
@RestController
public class DashboardController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greetings")
    public Greetings getGreetings(@RequestParam(value = "name", defaultValue = "World") String name){
        return  DashboardService.getGreetings(counter.incrementAndGet(),name);
    }
}