package yufeng.guru.springframework.spring5webapp.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import yufeng.guru.springframework.resfful.service.RestBaseService;
@Controller
public class RestServiceController {

    private final RestBaseService restBaseService;

    public RestServiceController(RestBaseService restBaseService) {
        this.restBaseService = restBaseService;
    }

    public String getService() {
        return restBaseService.getService();
    }
}
