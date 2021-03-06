package com.pcp.rabbit.com.pcp.rabbit.customer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @depict: 直接模式的消费者
 * @author: PCP
 * @create: 2019-03-06 14:28
 */
@Component
@RabbitListener(queues = "itcast3")
public class Customer3 {

    @RabbitHandler
    public void getMsg(String msg){
        System.out.println("itcast3分裂模式消费："+msg);
    }
}
