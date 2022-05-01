package yufeng.guru.springframework.spring5webapp.service;

public class I18NTaiwanService implements GreetService {
    @Override
    public String sayGreeting() {
        return "各位好 - TWN profile";
    }
}
