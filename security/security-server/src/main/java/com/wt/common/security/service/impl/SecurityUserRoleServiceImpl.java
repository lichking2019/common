package com.wt.common.security.service.impl;

import com.wt.common.security.dao.SecurityUserRoleMapper;
import com.wt.common.security.domain.SecurityUserRole;
import com.wt.common.security.service.SecurityUserRoleService;
import com.wt.master.core.base.support.ServiceSupport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
@Slf4j
public class SecurityUserRoleServiceImpl extends ServiceSupport<SecurityUserRole, SecurityUserRoleMapper> implements SecurityUserRoleService {

    @Autowired
    private SecurityUserRoleMapper securityUserRoleMapper;

    @Override
    protected SecurityUserRoleMapper getMapper() {
        return securityUserRoleMapper;
    }

    @Override
    protected Class<SecurityUserRole> getEntityType() {
        return SecurityUserRole.class;
    }

    @Override
    public void deleteRelationOfUser(Serializable userId) {
        SecurityUserRole securityUserRole = new SecurityUserRole();
        securityUserRole.setUserId(userId);
        this.deleteByCondition(securityUserRole);
    }
}
