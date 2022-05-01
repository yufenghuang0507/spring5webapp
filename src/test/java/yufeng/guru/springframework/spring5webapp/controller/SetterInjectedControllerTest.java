package yufeng.guru.springframework.spring5webapp.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import yufeng.guru.springframework.spring5webapp.service.ConstructorInjectedService;

class SetterInjectedControllerTest {

    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetService(new ConstructorInjectedService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}