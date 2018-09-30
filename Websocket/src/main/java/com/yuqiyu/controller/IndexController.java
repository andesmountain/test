package com.yuqiyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: ycig
 * @Date: 2018/9/30 10:08
 * @Description:
 */
@Controller
public class IndexController {
    @RequestMapping("/")
   public String index(){
       return "index";
   }
}

