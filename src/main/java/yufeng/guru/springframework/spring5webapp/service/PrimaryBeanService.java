package yufeng.guru.springframework.spring5webapp.service;

public class PrimaryBeanService implements GreetService {
    @Override
    public String sayGreeting() {
        return "Hello every body - PRIMARY SERVICE";
    }
}
