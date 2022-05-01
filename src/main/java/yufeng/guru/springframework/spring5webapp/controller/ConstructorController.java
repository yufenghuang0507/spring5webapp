package yufeng.guru.springframework.spring5webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import yufeng.guru.springframework.spring5webapp.service.GreetService;

@Controller
public class ConstructorController {
    public GreetService greetService;

    // Spring4.3開始constructor injected可以省略@Autowired
//    @Autowired
    public ConstructorController(@Qualifier("constructorInjectedService") GreetService greetService) {
        this.greetService = greetService;
    }

    public String getGreeting() {
        return greetService.sayGreeting();
    }
}
