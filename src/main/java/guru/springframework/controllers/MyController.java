package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Ignat on 01.08.2018.
 */
@Controller
public class MyController {

    public String hello() {
        System.out.println("Hello!");

        return "foo";
    }

}
