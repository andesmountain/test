package com.yuqiyu.modules;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.ProducerListener;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Auther: ycig
 * @Date: 2018/9/25 16:24
 * @Description:
 */
@Component
@Slf4j
public class Producer {

    @Autowired
    private KafkaTemplate kafkaTemplate;
    //发送消息方法
    public void send(String msg) {
        JSONObject obj=new JSONObject();
        obj.put("id",System.currentTimeMillis());
        obj.put("name","生产者发送消息");
        obj.put("msg",msg);
        obj.put("date",new Date());
        //这个 topic 在 Java 程序中是不需要提前在 Kafka 中设置的，因为它会在发送的时候自动创建你设置的 topic

        //log.info("向topic【bbb】发送内容：{}",obj.toString());
        kafkaTemplate.send("bbb",obj.toString());


        //消息发送的监听器，用于回调返回信息
       /* kafkaTemplate.setProducerListener(new ProducerListener<String, String>() {
            @Override
            public void onSuccess(String topic, Integer partition, String key, String value, RecordMetadata recordMetadata) {
                log.info("向kafka推送数据成功：[{}]", topic);
            }

            @Override
            public void onError(String topic, Integer partition, String key, String value, Exception exception) {
                log.error("发送数据出错！！！{}{}", topic, key);
            }

            @Override
            public boolean isInterestedInSuccess() {
                log.info("数据发送完毕");
                return false;
            }
        });*/

    }

}
