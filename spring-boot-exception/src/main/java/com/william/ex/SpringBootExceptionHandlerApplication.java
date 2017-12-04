package com.william.ex;

import com.william.ex.utils.SpringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootExceptionHandlerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootExceptionHandlerApplication.class, args);
    }

    @Bean
    public SpringUtils springUtilsBean() {
        return new SpringUtils();
    }
}
