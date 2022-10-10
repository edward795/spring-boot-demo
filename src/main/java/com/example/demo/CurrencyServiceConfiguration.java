package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="currency-service")
@Component
public class CurrencyServiceConfiguration {
    private String url;
    private String username;
    private String key;

    public String getUrl(){
        return url;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return key;
    }

    public void setUrl(String url){
        this.url=url;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setPassword(String key){
        this.key=key;
    } 
}
