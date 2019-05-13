package com.wt.common.security.service.impl;

import com.wt.common.security.dao.SecurityUnitMapper;
import com.wt.common.security.domain.SecurityUnit;
import com.wt.common.security.service.SecurityUnitService;
import com.wt.master.core.base.support.ServiceSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 机构服务层实现
 *
 * @author lichking2019@aliyun.com
 * @date May 13, 2019 at 11:17:35 AM
 */
public class SecurityUnitServiceImpl extends ServiceSupport<SecurityUnit, SecurityUnitMapper> implements SecurityUnitService {
    @Autowired
    private SecurityUnitMapper securityUnitMapper;

    @Override
    protected SecurityUnitMapper getMapper() {
        return securityUnitMapper;
    }

    @Override
    protected Class<SecurityUnit> getEntityType() {
        return SecurityUnit.class;
    }
}
