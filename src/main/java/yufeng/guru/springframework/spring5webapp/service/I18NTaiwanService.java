package yufeng.guru.springframework.spring5webapp.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"TWN"})
@Service("i18NService")
public class I18NTaiwanService implements GreetService {
    @Override
    public String sayGreeting() {
        return "各位好 - TWN profile";
    }
}
