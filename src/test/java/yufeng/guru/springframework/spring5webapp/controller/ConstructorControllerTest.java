package yufeng.guru.springframework.spring5webapp.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import yufeng.guru.springframework.spring5webapp.service.ConstructorInjectedService;

class ConstructorControllerTest {

    ConstructorController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorController(new ConstructorInjectedService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}