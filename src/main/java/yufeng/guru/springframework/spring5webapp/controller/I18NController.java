package yufeng.guru.springframework.spring5webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import yufeng.guru.springframework.spring5webapp.service.GreetService;

@Controller
public class I18NController {
    private final GreetService greetService;

    @Autowired
    public I18NController(@Qualifier("i18NService") GreetService greetService) {
        this.greetService = greetService;
    }

    public String sayHello() {
        return greetService.sayGreeting();
    }
}
