package yufeng.guru.springframework.spring5webapp.controller;

import org.springframework.stereotype.Controller;
import yufeng.guru.springframework.spring5webapp.service.GreetService;

@Controller
public class TestController {

    private final GreetService greetService;

    public TestController(GreetService greetService) {
        this.greetService = greetService;
    }

    public String sayHello() {
        return greetService.sayGreeting();
    }
}
