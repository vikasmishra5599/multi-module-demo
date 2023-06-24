package org.example;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:backend-app.properties")
@Data
@NoArgsConstructor
public class DbConfig {

    @Value("${demo.backend.msg}")
    private String msg ;
}
