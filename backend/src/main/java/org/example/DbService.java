package org.example;

import org.springframework.stereotype.Repository;

@Repository
public class DbService
{
    public String getDemo() {
        return "hello";
    }
}
