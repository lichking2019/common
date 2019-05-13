package com.wt.common.security.service.impl;

import com.wt.common.security.dao.SecurityMenuMapper;
import com.wt.common.security.domain.SecurityMenu;
import com.wt.common.security.service.SecurityMenuService;
import com.wt.master.core.base.support.ServiceSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * 菜单服务
 */
@Service
public class SecurityMenuServiceImpl extends ServiceSupport<SecurityMenu, SecurityMenuMapper> implements SecurityMenuService {
    @Autowired
    private SecurityMenuMapper securityMenuMapper;


    @Override
    protected SecurityMenuMapper getMapper() {
        return securityMenuMapper;
    }

    @Override
    protected Class<SecurityMenu> getEntityType() {
        return SecurityMenu.class;
    }

    @Override
    @Cacheable(value = "SecurityMenu",key = "#root.targetClass+'.'+#root.methodName+'#'+#entityId")
    public SecurityMenu findById(Serializable entityId) {
        return super.findById(entityId);
    }
}
