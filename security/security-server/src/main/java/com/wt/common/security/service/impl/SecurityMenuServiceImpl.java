package com.wt.common.security.service.impl;

import com.wt.common.security.dao.SecurityMenuMapperSupport;
import com.wt.common.security.domain.SecurityMenu;
import com.wt.common.security.domain.SecurityUser;
import com.wt.common.security.service.SecurityMenuService;
import com.wt.common.security.service.SecurityUserService;
import com.wt.master.core.base.support.ServiceSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 菜单服务
 */
@Service
public class SecurityMenuServiceImpl extends ServiceSupport<SecurityMenu, SecurityMenuMapperSupport> implements SecurityMenuService {
    @Autowired
    private SecurityMenuMapperSupport securityMenuMapper;


    @Override
    protected SecurityMenuMapperSupport getMapper() {
        return securityMenuMapper;
    }

    @Override
    protected Class<SecurityMenu> getEntityType() {
        return SecurityMenu.class;
    }
}
