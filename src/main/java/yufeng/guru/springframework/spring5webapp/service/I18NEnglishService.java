package yufeng.guru.springframework.spring5webapp.service;

import yufeng.guru.springframework.spring5webapp.repositories.EnglishGreetingRepository;

public class I18NEnglishService implements GreetService {

    private final EnglishGreetingRepository englishRepository;

    public I18NEnglishService(EnglishGreetingRepository englishRepository) {
        this.englishRepository = englishRepository;
    }

    @Override
    public String sayGreeting() {
        return englishRepository.getGreeting();
    }
}
