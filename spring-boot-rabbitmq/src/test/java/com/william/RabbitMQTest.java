package com.william;

import com.william.mq.RunMain;
import com.william.mq.spring_boot.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by sungang on 2017/11/30.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = RunMain.class)
public class RabbitMQTest {

    @Autowired
    private Sender sender;
    @Test
    public void send() throws Exception {
        sender.send();
    }
}
