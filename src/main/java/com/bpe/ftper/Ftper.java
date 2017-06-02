package com.bpe.ftper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Ftper {
    public static void main(String[] args) {
        SpringApplication.run(Ftper.class, args);
    }

    @RequestMapping(value = "/")
    String hello() {
        return "Hello World!";
    }
}