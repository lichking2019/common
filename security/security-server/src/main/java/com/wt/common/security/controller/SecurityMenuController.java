package com.wt.common.security.controller;

import com.wt.common.security.domain.SecurityMenu;
import com.wt.common.security.service.SecurityMenuService;
import com.wt.common.security.service.impl.SecurityMenuServiceImpl;
import com.wt.master.core.base.BaseController;
import com.wt.master.core.base.BaseService;
import com.wt.master.core.helper.QueryHelper;
import com.wt.master.core.request.HttpResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security/menu")
public class SecurityMenuController extends BaseController<SecurityMenu,SecurityMenuService> {
    @Autowired
    private SecurityMenuService securityMenuService;


    @Override
    protected SecurityMenuService getService() {
        return securityMenuService;
    }


}
