package com.yuqiyu.modules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ycig
 * @Date: 2018/9/25 16:52
 * @Description:
 */

@Controller
public class TestController {

    @Autowired
    public Producer producer;

    @ResponseBody
    @RequestMapping("/send")
    public String sendMsg(String msg){

        producer.send(msg);

        return "发送成功";

    }

    @ResponseBody
    @RequestMapping("/batch")
    public String batch(){
        for (int i = 0; i < 20; i++) {
            //调用消息发送类中的消息发送方法
            producer.send(i+"");

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "ok";

    }


    @RequestMapping("/")
    public String index(){
        return "/index";
    }
}
