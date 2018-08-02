package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

/**
 * Created by Ignat on 01.08.2018.
 */
public class ConstructorInjectedController {

    GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
