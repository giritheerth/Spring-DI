package com.learn.dependencyInjection.bean;

public class InstagramService implements SocialMediaService{

    @Override
    public void getUserFeeds(){
        System.out.println("Instagram feeds loaded!");
    }

}
