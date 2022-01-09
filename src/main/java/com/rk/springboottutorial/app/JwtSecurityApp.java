package com.rk.springboottutorial.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.rk.springboottutorial")
public class JwtSecurityApp {

    public static void main(String[] args) {
        SpringApplication.run(JwtSecurityApp.class, args);
    }
}
