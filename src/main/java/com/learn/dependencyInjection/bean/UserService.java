package com.learn.dependencyInjection.bean;

public class UserService {

    private SocialMediaService socialMediaService;

    

    public void displayFeeds(){
        // approach 1
      //  SocailMediaApp socailMediaApp = new SocailMediaApp();
      //  FacebookService facebookService = new FacebookService();
      //  InstagramService instagramService = new InstagramService(); 
      //  socailMediaApp.getUserFeeds();

      // approach 2
     // SocialMediaService socialMediaService = new FacebookService();
     // socialMediaService.getUserFeeds();

    // approach 3 - based on getInstance('')
   // SocialMediaService instance = SocialMediaFactory.getInstance("facebook");
   // instance.getUserFeeds();
        socialMediaService.getUserFeeds();
    }

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.displayFeeds();
    }
   

}
