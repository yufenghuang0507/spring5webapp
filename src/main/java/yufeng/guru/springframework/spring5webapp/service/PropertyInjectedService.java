package yufeng.guru.springframework.spring5webapp.service;

public class PropertyInjectedService implements GreetService {
    @Override
    public String sayGreeting() {
        return "Hello every body - Property injected";
    }
}
