package yufeng.guru.springframework.spring5webapp.config;

import org.springframework.context.annotation.*;
import yufeng.guru.springframework.spring5webapp.repositories.EnglishGreetingRepository;
import yufeng.guru.springframework.spring5webapp.repositories.EnglishGreetingRepositoryImpl;
import yufeng.guru.springframework.spring5webapp.service.*;

@Configuration
@ImportResource("classpath:spring-config.xml")
public class GreetingServiceConfig {
    @Bean
    EnglishGreetingRepository englishRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile({"EN","default"})
    @Bean("i18NService")
    I18NEnglishService i18NEnglishService(EnglishGreetingRepository englishRepository) {
        return new I18NEnglishService(englishRepository);
    }

    @Profile({"TWN"})
    @Bean("i18NService")
    I18NTaiwanService i18NTaiwanService() {
        return new I18NTaiwanService();
    }

    @Primary
    @Bean
    PrimaryBeanService primaryBeanService() {
        return new PrimaryBeanService();
    }

    @Bean
    ConstructorInjectedService constructorInjectedService() {
        return new ConstructorInjectedService();
    }

    @Bean
    PropertyInjectedService propertyInjectedService() {
        return new PropertyInjectedService();
    }

    @Bean
    SetterInjectedService setterInjectedService() {
        return new SetterInjectedService();
    }
}
