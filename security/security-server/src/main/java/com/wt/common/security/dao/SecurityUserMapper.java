package com.wt.common.security.dao;

import com.wt.common.security.domain.SecurityUser;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/**
 * @ProjectName: study
 * @Package: com.wt.study.springboot.common.security.server.dao
 * @Description: 用户管理dao
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-04-04 11:49
 * @Version: v1.0
 */
public interface SecurityUserMapper {
    /**
     * 查询所有用户信息
     * @return 用户集合
     */
    List<SecurityUser> findAll();

    /**
     * 添加用户
     * @param securityUser 用户信息
     */
    @Options(useGeneratedKeys = true, keyProperty = "entity.userId")
    void add(@Param("entity") SecurityUser securityUser);

    /**
     * 批量添加用户
     * @param securityUserList 用户信息集合
     */
    void addBatch(@Param("entities") List<SecurityUser> securityUserList);

    /**
     * 删除用户
     * @param id 用户ID
     */
    void delete(@Param("id") Serializable id);

    /**
     * 更新用户
     * @param securityUser 用户信息
     */
    void update(@Param("entity") SecurityUser securityUser);

    /**
     * 批量更新用户
     * @param securityUserList 用户信息
     */
    void updateBatch(@Param("entities") List<SecurityUser> securityUserList);

    /**
     * 根据用户ID 查询用户
     * @param userId 用户ID
     * @return
     */
    // 【知识点】，Mybatis返回的查询结果不一定都是集合，如果要是使用单个对象接收，那么Mybatis会智能组装成单一对象，而不用List.get(0)
    SecurityUser findById(@Param("id") Serializable userId);

    /**
     * 逻辑删除
     * @param userId 用户ID
     */
    int logicDelete(@Param("id") Serializable userId);





}
