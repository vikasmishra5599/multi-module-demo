package org.example;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RestAPIController {

    @GetMapping("/test")
    public String getHello() {
        return "Hello";
    }
}
