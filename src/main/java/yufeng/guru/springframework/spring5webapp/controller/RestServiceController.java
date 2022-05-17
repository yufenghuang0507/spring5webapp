package yufeng.guru.springframework.spring5webapp.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import yufeng.guru.springframework.resfful.service.RestBaseService;
@Controller
public class RestServiceController {

    private final RestBaseService restBaseService;

    /*
     * 如果RestServiceConfig.java中，沒有對相同類型的Bean加上@Primary，就會有Intellij IDEA的error，程式本身可正確執行
     * IDE只是提醒有相同型態的Bean，但卻沒有@Qualifier，但我們其實已經在RestServiceConfig.java中有對@Bean設定@Profile，
     * 所以其實只會有一個@Bean被載入，只是IDE認為這樣的情況不應該發生
     */
    public RestServiceController(RestBaseService restBaseService) {
        this.restBaseService = restBaseService;
    }

    public String getService() {
        return restBaseService.getService();
    }
}
