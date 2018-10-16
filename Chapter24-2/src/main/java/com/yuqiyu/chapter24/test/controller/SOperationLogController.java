package com.yuqiyu.chapter24.test.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yuqiyu.chapter24.test.entity.SOperationLog;
import com.yuqiyu.chapter24.test.mapper.SOperationLogMapper;
import com.yuqiyu.chapter24.test.service.SOperationLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: ycig
 * @Date: 2018/7/26 14:20
 * @Description:
 */
@RestController
public class SOperationLogController {


    @Autowired
    SOperationLogService service;

    @RequestMapping("/SOperationLog/list")
    public List<SOperationLog> getLimitList(String username,String funcId){
       return service.getLimitList(username,funcId);
    }
}
