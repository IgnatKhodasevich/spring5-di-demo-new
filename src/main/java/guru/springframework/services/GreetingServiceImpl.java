package guru.springframework.services;

import org.springframework.stereotype.Controller;

/**
 * Created by Ignat on 01.08.2018.
 */
@Controller
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO = "Hello!!!";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
