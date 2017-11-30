package com.william.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by sungang on 2017/11/30.
 */
@SpringBootApplication
@EnableAutoConfiguration
public class RunMain {

    public static void main(String[] args) {
        SpringApplication.run(RunMain.class, args);
    }
}
