package yufeng.guru.springframework.resfful.service;

public class RestServiceFactory {

    public RestBaseService getRestBaseService(String restType) {
        switch(restType) {
            case "GET" :
                return new GetService();
            case "POST" :
                return new PostService();
            default :
                return new PostService();
        }
    }
}
