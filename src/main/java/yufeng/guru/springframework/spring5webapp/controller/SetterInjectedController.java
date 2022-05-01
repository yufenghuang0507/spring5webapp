package yufeng.guru.springframework.spring5webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import yufeng.guru.springframework.spring5webapp.service.GreetService;

@Controller
public class SetterInjectedController {

    private GreetService greetService;

    @Autowired
    @Qualifier("setterInjectedService")
    public void setGreetService(GreetService greetService) {
        this.greetService = greetService;
    }

    public String getGreeting() {
        return greetService.sayGreeting();
    }
}
