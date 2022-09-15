package com.side.toon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ToonMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToonMainApplication.class, args);
    }
}
