package yufeng.guru.springframework.spring5webapp.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryBeanService implements GreetService {
    @Override
    public String sayGreeting() {
        return "Hello every body - PRIMARY SERVICE";
    }
}
