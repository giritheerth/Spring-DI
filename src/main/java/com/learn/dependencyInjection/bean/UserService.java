package com.learn.dependencyInjection.bean;

public class UserService {

    private SocialMediaService socialMediaService;

    // getter and setter or constructor - dependency injection pattern
    // spring will take ownership of creating the object and setting the object
    // known as inversion of control.

    public void displayFeeds() {
        // approach 1 -creating the object dependency
        // SocailMediaApp socailMediaApp = new SocailMediaApp();
        // FacebookService facebookService = new FacebookService();
        // InstagramService instagramService = new InstagramService();
        // socailMediaApp.getUserFeeds();

        // approach 2
        // SocialMediaService socialMediaService = new FacebookService();
        // socialMediaService.getUserFeeds();

        // approach 3 - based on getInstance('') -create a factory and get an instance
        // SocialMediaService instance = SocialMediaFactory.getInstance("facebook");
        // instance.getUserFeeds();
        socialMediaService.getUserFeeds();
    }

    public static void main(String[] args) {
        UserService userService = new UserService();
        // dynimic way of setting the object
        // userService.setSocialMediaService(new FacebookService());
        userService.displayFeeds();
    }

}
