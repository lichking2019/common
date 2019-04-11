package com.wt.common.security.service;

import com.wt.common.security.domain.SecurityUser;
import com.wt.master.core.base.BaseService;

import java.io.Serializable;
import java.util.List;

/**
 * @ProjectName: study
 * @Package: com.wt.study.springboot.common.security.server.service
 * @Description: 用户服务
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-04-04 11:43
 * @Version: v1.0
 */
public interface SecurityUserService {

    /**
     * 查询全部用户信息
     * @return 用户集合
     */
    List<SecurityUser> findAll();

    /**
     * 添加用户
     * @param securityUser 用户信息
     */
    void add(SecurityUser securityUser);

    /**
     * 批量添加用户
     * @param securityUserList 用户信息集合
     */
    void addBatch(List<SecurityUser> securityUserList);

    /**
     * 删除用户
     * @param id 用户id
     */
    void delete(Serializable id);

    /**
     * 更新用户
     * @param securityUser 用户信息
     */
    void update(SecurityUser securityUser);

    /**
     * 批量更新用户
     * @param securityUserList 用户信息
     */
    void updateBatch(List<SecurityUser> securityUserList);

    /**
     * 根据用户ID查询用户信息
     * @param userId 用户ID
     * @return
     */
    SecurityUser findById(Integer userId);

    /**
     * 逻辑删除
     * @param userId 用户ID
     */
    int logicDelete(Serializable userId);

}
