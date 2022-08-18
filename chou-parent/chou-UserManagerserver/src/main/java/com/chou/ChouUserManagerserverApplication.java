package com.chou;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.chou.mapper")
@SpringBootApplication
public class ChouUserManagerserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChouUserManagerserverApplication.class, args);
        System.out.println("http://localhost:8080/doc.html");
    }

}
