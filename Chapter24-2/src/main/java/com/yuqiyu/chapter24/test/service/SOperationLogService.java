package com.yuqiyu.chapter24.test.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yuqiyu.chapter24.test.entity.SOperationLog;
import com.yuqiyu.chapter24.test.mapper.SOperationLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: ycig
 * @Date: 2018/7/26 14:44
 * @Description:
 */
@Service
public class SOperationLogService {
    /**
     @MapperScan自动将这些mapper进行bean对象封装
     */
    @Autowired
    SOperationLogMapper mapper;

    public List<SOperationLog> getLimitList(String username, String funcId){
        PageHelper.startPage(1,10);
        return mapper.queryUserLogList(username,null,null,funcId);
    }

}
