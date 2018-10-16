package com.yuqiyu.chapter24.rwtest.mapper;

import com.yuqiyu.chapter24.common.BaseMapper;
import com.yuqiyu.chapter24.rwtest.entity.SRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SRoleMapper extends BaseMapper<SRole> {

	List<SRole> findByConds(@Param("roleName") String roleName, @Param("roleType") Integer roleType);

	int checkRoleNameIsExists(String roleName);

	int checkRoleCodeIsExists(String roleCode);

	int canDelete(@Param("roleId") String roleId);

	String findMaxRoleCode();

	List<SRole> selectAllExculdeSuperRole(@Param("roleCode") String roleCode, @Param("roleType") String roleType);

	SRole selectByRoleCode(String roleCode);

	List<SRole> queryByUserid(String userid);
}