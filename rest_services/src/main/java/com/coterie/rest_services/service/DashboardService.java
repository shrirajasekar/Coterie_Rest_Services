package com.coterie.rest_services.service;

import com.coterie.rest_services.model.Greetings;

import org.springframework.stereotype.Service;

/**
 * DashboardService
 */
@Service
public class DashboardService {

    
    public static Greetings getGreetings(long n,String name){
        return new Greetings(n,name);
    }


}