package com.xcy.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.xcy")
@MapperScan("com.xcy.mapper")
public class App {

    public static void main(String[] args)  {
        System.out.println("App starts...");
        ConfigurableApplicationContext ac = SpringApplication.run(App.class, args);
        System.out.println("App started successfully.");
    }

}
