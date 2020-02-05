package com.warmfrog.star;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author libo
 * @date 2020/2/4
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.warmfrog.star"})
@MapperScan(basePackages = {"com.warmfrog.star.dao"})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

