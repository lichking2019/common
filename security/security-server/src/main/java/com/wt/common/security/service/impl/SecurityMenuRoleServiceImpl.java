package com.wt.common.security.service.impl;


import com.wt.common.security.dao.SecurityMenuRoleMapper;
import com.wt.common.security.domain.SecurityMenuRole;
import com.wt.common.security.service.SecurityMenuRoleService;
import com.wt.master.core.base.support.ServiceSupport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SecurityMenuRoleServiceImpl extends ServiceSupport<SecurityMenuRole, SecurityMenuRoleMapper> implements SecurityMenuRoleService {

    @Autowired
    private SecurityMenuRoleMapper securityMenuRoleMapper;

    @Override
    protected SecurityMenuRoleMapper getMapper() {
        return securityMenuRoleMapper;
    }

    @Override
    protected Class<SecurityMenuRole> getEntityType() {
        return SecurityMenuRole.class;
    }
}
