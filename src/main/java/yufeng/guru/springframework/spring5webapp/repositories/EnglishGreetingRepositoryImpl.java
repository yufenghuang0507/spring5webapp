package yufeng.guru.springframework.spring5webapp.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello every body - EN profile by use repository";
    }
}
