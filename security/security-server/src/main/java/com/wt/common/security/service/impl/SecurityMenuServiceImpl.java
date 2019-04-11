package com.wt.common.security.service.impl;

import com.wt.common.security.dao.SecurityMenuMapper;
import com.wt.common.security.domain.SecurityMenu;
import com.wt.common.security.service.SecurityMenuService;
import com.wt.master.core.base.BaseMapper;
import com.wt.master.core.base.BaseService;
import com.wt.master.core.base.support.ServiceSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 菜单服务
 */
@Service
public class SecurityMenuServiceImpl extends ServiceSupport<SecurityMenu,SecurityMenuMapper> implements SecurityMenuService {
    @Autowired
    private SecurityMenuMapper securityMenuMapper;


    @Override
    protected SecurityMenuMapper getMapper() {
        return securityMenuMapper;
    }
}
