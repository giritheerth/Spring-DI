package com.learn.dependencyInjection.di;

import org.springframework.stereotype.Service;

// pojo class with getter and setter -bean
// load the classes into context and provide me an object for the same requried
//@Service
public class WhatsAppService implements SocialAppStore{
    
    public WhatsAppService(){
        System.out.println("WhatsAppService object created");
    }
    @Override
    public void getUserFeeds(){ // business logic
        System.out.println("WhatsApp feeds are displayed");
    }

}
