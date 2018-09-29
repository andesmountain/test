package com.yuqiyu.modules;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yuqiyu.config.WebsocketServer;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @Auther: ycig
 * @Date: 2018/9/25 16:50
 * @Description:
 */
@Component
@Slf4j
public class Consumer {
    @Autowired
    WebsocketServer websocketServer;

    @KafkaListener(topics = {"bbb","aaa"})
    public void listen (ConsumerRecord<?, ?> record) throws Exception {
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            JSONObject jsonMsg = JSON.parseObject(message.toString());
            log.info("消费者开始消费message：" + message);

            // 静态方法
            WebsocketServer.sendInfo(jsonMsg.get("msg").toString());

        }
    }

}
