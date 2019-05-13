package com.wt.common.security.service.impl;

import com.wt.common.security.dao.SecurityUserMapper;
import com.wt.common.security.domain.SecurityUser;
import com.wt.common.security.domain.SecurityUserRole;
import com.wt.common.security.service.SecurityUserRoleService;
import com.wt.common.security.service.SecurityUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: study
 * @Package: com.wt.study.springboot.common.security.server.service.impl
 * @Description: 用户服务实现
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-04-04 11:44
 * @Version: v1.0
 */
@Service
public class SecurityUserServiceImpl implements SecurityUserService {

    @Autowired
    private SecurityUserMapper securityUserMapper;

    @Autowired
    private SecurityUserRoleService securityUserRoleService;

    @Override
    public List<SecurityUser> findAll() {
        return securityUserMapper.findAll();
    }

    @Override
    public void add(SecurityUser securityUser) {
        securityUserMapper.add(securityUser);
        //添加角色用户关系
        this.addUserRoleRelation(securityUser);
    }

    @Override
    public void delete(Serializable id) {
        securityUserMapper.delete(id);
        //删除用户角色关系
        securityUserRoleService.deleteRelationOfUser(id);
    }

    @Override
    public void update(SecurityUser securityUser) {
        securityUserMapper.update(securityUser);
        //删除用户角色关系
        securityUserRoleService.deleteRelationOfUser(securityUser.getUserId());
        //添加用户角色关系
        this.addUserRoleRelation(securityUser);
    }



    @Override
    public SecurityUser findById(Integer userId) {
        return securityUserMapper.findById(userId);
    }

    @Override
    public int logicDelete(Serializable userId) {
        return securityUserMapper.logicDelete(userId);
    }

    @Override
    public void addBatch(List<SecurityUser> securityUserList) {
        securityUserMapper.addBatch(securityUserList);
    }

    @Override
    public void updateBatch(List<SecurityUser> securityUserList) {
        securityUserMapper.updateBatch(securityUserList);
    }

    /**
     * 添加用户角色关系
     * @param securityUser
     */
    private void addUserRoleRelation(SecurityUser securityUser){
        List<Serializable> roleIdList = securityUser.getRoleIdList();
        ArrayList<SecurityUserRole> securityUserRoles = new ArrayList<>();
        //添加角色用户关系
        for (Serializable roleId : roleIdList) {
            SecurityUserRole securityUserRole = new SecurityUserRole();
            securityUserRole.setRoleId(roleId);
            securityUserRole.setUserId(securityUser.getUserId());
            securityUserRoles.add(securityUserRole);
        }
        securityUserRoleService.addBatch(securityUserRoles);
    }
}
