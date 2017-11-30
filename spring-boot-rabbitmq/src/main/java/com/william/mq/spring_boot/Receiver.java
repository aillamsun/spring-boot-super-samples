package com.william.mq.spring_boot;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sungang on 2017/11/30.
 */
@Service
public class Receiver {

    @Autowired
    private AmqpTemplate rabbitTemplate;


    @RabbitListener(queues = "spring-boot-simple")
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }

}
