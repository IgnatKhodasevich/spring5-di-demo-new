package guru.springframework.controllers;


import guru.springframework.services.GreetingServiceImpl;

/**
 * Created by Ignat on 01.08.2018.
 */
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
