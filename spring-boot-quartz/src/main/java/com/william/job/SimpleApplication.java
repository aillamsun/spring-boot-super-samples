package com.william.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by sungang on 2017/12/4.
 */
@SpringBootApplication
public class SimpleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SimpleApplication.class, args);

        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println("BeanName: " + beanName);
        }
    }
}
