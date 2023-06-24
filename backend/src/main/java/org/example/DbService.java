package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DbService {

    private DbConfig dbConfig;

    @Autowired
    public DbService(DbConfig dbConfig) {
        this.dbConfig = dbConfig;
    }

    public String getDemo() {
        return  dbConfig.getMsg();
    }
}
