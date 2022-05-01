package yufeng.guru.springframework.spring5webapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import yufeng.guru.springframework.resfful.service.GetService;
import yufeng.guru.springframework.resfful.service.PostService;
import yufeng.guru.springframework.resfful.service.RestBaseService;
import yufeng.guru.springframework.resfful.service.RestServiceFactory;

@Configuration
public class RestServiceConfig {

    @Bean
    RestServiceFactory restServiceFactory() {
        return new RestServiceFactory();
    }

    @Profile({"post","default"})
    @Bean
    RestBaseService postService(RestServiceFactory restServiceFactory) {
        return (PostService)restServiceFactory.getRestBaseService("POST");
    }

    @Profile("get")
    @Bean
    RestBaseService getService(RestServiceFactory restServiceFactory) {
        return (GetService)restServiceFactory.getRestBaseService("GET");
    }

}
