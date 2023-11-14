package com.example.exp02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@EnableWebMvc
@SpringBootApplication
public class Exp02Application {

    public static void main(String[] args) {
        SpringApplication.run(Exp02Application.class, args);
    }

}
