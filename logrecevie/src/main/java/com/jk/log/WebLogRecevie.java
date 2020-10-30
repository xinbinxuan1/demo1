package com.jk.log;

import com.alibaba.fastjson.JSONObject;
import com.jk.entity.LogBean;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Component
@RabbitListener(queues = "5_xiao")
public class WebLogRecevie {

    @Autowired
    private MongoTemplate mongoTemplate;

    @RabbitHandler
    public void logRecevie(String logMes, Channel channel, Message message){
        try {
            System.out.println(logMes);
            LogBean log = JSONObject.parseObject(logMes,LogBean.class);
            System.out.println(log);
            mongoTemplate.save(log,"log");
            System.out.println(message.getMessageProperties().getDeliveryTag());
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        }catch (IOException e){
            System.out.println("消费消息失败");
            e.printStackTrace();
        }
    }

}
