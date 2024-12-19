package com.learn.dependencyInjection.config;

import org.springframework.context.annotation.Bean;

import com.learn.dependencyInjection.di.SocialAppStore;
import com.learn.dependencyInjection.di.UserApp;
import com.learn.dependencyInjection.di.WhatsAppService;

public class ApplicationConfig {

    @Bean
    public UserApp userApp() {
        return new UserApp();
    }

    @Bean
    public SocialAppStore socialAppStore() {
        return new WhatsAppService();
    }

}
