# Spring-DI

    // getter and setter or constructor - dependency injection pattern
    // spring will take ownership of creating the object and setting the object
    // known as inversion of control.

   
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

sterotype annotation _/
@Component // parent annotation - identify the role of the class - it is a component class
@Service // child annotation - identify the role of the class - it is a service class (business logic)
@Repository // child annotation - database related class
@Controller // child annotation - controller class

@Qualifier("") // create bean for the specified one

// constructor injection - depedencies are passed to a class through its constructor , ensure immutability(for final fields can be used)

// setter injection - dependencies are injected through setter methods after the object is instantiated, allows optional, dynamic changeable dependencies

// @Autowired- autowiring locate and inject the required bean into the dependent bean by matching type of dependency.
Field injection is generally not recommended because it makes testing and mocking difficult. Constructor injection is preferred
Constructor is prefered as it ensures immutability of dependencies and guarantees all required dependencies are initialized.