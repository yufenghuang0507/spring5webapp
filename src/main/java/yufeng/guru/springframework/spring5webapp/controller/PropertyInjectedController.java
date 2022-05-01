package yufeng.guru.springframework.spring5webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import yufeng.guru.springframework.spring5webapp.service.GreetService;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyInjectedService")
    public GreetService greetService;

    public String getGreeting() {
        return greetService.sayGreeting();
    }
}

