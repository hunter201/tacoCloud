package com.rad.springstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan("com.rad")
public class SpringStarterApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringStarterApplication.class, args);
    }

}
