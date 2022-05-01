package yufeng.guru.springframework.spring5webapp.service;

public class ConstructorInjectedService implements GreetService {
    @Override
    public String sayGreeting() {
        return "Hello every body - Constructor injected";
    }
}



