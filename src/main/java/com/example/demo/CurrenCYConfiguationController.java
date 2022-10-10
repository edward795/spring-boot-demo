package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrenCYConfiguationController {
    @Autowired
    private CurrencyServiceConfiguration configuration;
    
    @RequestMapping("/currencies")
    public CurrencyServiceConfiguration retriveCurrencies(){
        return configuration;
    }
    
}
