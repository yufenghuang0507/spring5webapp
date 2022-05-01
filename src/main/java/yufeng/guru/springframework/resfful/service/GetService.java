package yufeng.guru.springframework.resfful.service;

public class GetService implements RestBaseService {
    @Override
    public String getService() {
        return "This is GET Service";
    }
}
