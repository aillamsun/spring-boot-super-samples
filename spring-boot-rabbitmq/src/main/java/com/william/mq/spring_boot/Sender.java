package com.william.mq.spring_boot;

import com.william.mq.spring_boot.config.RabbitMQConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sungang on 2017/11/30.
 */
@Service
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send() {
        System.out.println("梁桂钊 发送消息...");
        rabbitTemplate.convertAndSend(RabbitMQConfig.QUEUE_NAME, "你好， 梁桂钊!");
    }
}
