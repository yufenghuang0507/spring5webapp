package yufeng.guru.springframework.spring5webapp.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedService implements GreetService {
    @Override
    public String sayGreeting() {
        return "Hello every body - Property injected";
    }
}
