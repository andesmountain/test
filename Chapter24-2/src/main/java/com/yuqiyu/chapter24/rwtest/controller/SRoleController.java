package com.yuqiyu.chapter24.rwtest.controller;

import com.github.pagehelper.PageHelper;
import com.yuqiyu.chapter24.rwtest.entity.SRole;
import com.yuqiyu.chapter24.rwtest.service.SRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: ycig
 * @Date: 2018/7/26 15:47
 * @Description:
 */
@RestController
public class SRoleController {
    @Autowired
    SRoleService service;

    @RequestMapping("/SRole/list")
    public List<SRole> queryByUserid(String userid){
        return service.queryByUserid(userid);
    }

    @RequestMapping("/SRole/getByRoleCode")
    public SRole selectByRoleCode(String roleCode){
        return service.selectByRoleCode(roleCode);
    }
}
