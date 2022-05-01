package yufeng.guru.springframework.spring5webapp.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN","default"})
@Service("i18NService")
public class I18NEnglishService implements GreetService {
    @Override
    public String sayGreeting() {
        return "Hello every body - EN profile";
    }
}
