package org.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.example.*;

@RestController
@RequestMapping("/api")
public class RestAPIController {

    private DemoService demo;

    @Autowired
    public RestAPIController(DemoService demo) {
        this.demo = demo;
    }

    @GetMapping("/hello")
    public String getHello() {

        return demo.runDemo();
    }
}
