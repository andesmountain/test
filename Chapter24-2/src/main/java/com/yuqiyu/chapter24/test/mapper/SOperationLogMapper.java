package com.yuqiyu.chapter24.test.mapper;

import com.yuqiyu.chapter24.common.BaseMapper;
import com.yuqiyu.chapter24.test.entity.SOperationLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SOperationLogMapper extends BaseMapper<SOperationLog> {
	
	List<SOperationLog> queryUserLogList(
            @Param("username") String username,
            @Param("startLogDate") String startLogDate,
            @Param("endLogDate") String endLogDate,
            @Param("funcId") String funcId);
}