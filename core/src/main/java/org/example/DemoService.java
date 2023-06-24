package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource(value = "classpath:core-app.properties")
public class DemoService {

    private DbService dbService;

    @Value("${demo.core.msg}")
    private String msg;

    @Autowired
    public DemoService(DbService dbService) {
        this.dbService = dbService;
    }

    public String runDemo() {
        return msg + " "+dbService.getDemo();
    }
}
