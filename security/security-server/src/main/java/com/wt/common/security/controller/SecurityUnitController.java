package com.wt.common.security.controller;

import com.wt.common.security.domain.SecurityUnit;
import com.wt.common.security.service.SecurityUnitService;
import com.wt.master.core.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 机构管理控制器
 *
 * @author lichking2019@aliyun.com
 * @date May 13, 2019 at 11:14:29 AM
 */
public class SecurityUnitController extends BaseController<SecurityUnit, SecurityUnitService> {
    @Autowired
    private SecurityUnitService securityUnitService;

    @Override
    protected SecurityUnitService getService() {
        return securityUnitService;
    }
}
