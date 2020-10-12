package com.fengwenyi.springbootdatacachedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootDataCacheDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDataCacheDemoApplication.class, args);
    }

}
