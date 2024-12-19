package com.learn.dependencyInjection.bean;

public class FacebookService implements SocialMediaService {

    @Override
    public void getUserFeeds(){
        System.out.println("Facebook feeds loaded!");
    }

}
