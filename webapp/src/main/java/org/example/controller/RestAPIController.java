package org.example.controller;

import org.example.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.example.*;

@RestController
@RequestMapping("/api")
public class RestAPIController {

    private DemoService demo;

    private AppConfig appConfig;

    @Autowired
    public RestAPIController(DemoService demo, AppConfig appConfig) {
        this.demo = demo;
        this.appConfig = appConfig;
    }

    @GetMapping("/hello")
    public String getHello() {

        return demo.runDemo()+ appConfig.getMsg();
    }
}
