package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    private DbService dbService;

    @Autowired
    public DemoService(DbService dbService) {
        this.dbService = dbService;
    }

    public String runDemo() {
        return dbService.getDemo();
    }
}
