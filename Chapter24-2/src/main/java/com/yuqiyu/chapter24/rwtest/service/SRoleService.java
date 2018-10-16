package com.yuqiyu.chapter24.rwtest.service;

import com.github.pagehelper.PageHelper;
import com.yuqiyu.chapter24.rwtest.entity.SRole;
import com.yuqiyu.chapter24.rwtest.mapper.SRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: ycig
 * @Date: 2018/7/26 15:45
 * @Description:
 */
@Service
public class SRoleService {
    @Autowired
    SRoleMapper mapper;

    public List<SRole>  queryByUserid(String userid){
        PageHelper.startPage(1,10);
        return mapper.queryByUserid(userid);
    }

    public SRole selectByRoleCode(String roleCode){
        PageHelper.startPage(1,10);
        return mapper.selectByRoleCode(roleCode);
    }

}
