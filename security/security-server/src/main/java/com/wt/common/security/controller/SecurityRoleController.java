package com.wt.common.security.controller;

import com.wt.common.security.domain.SecurityRole;
import com.wt.common.security.service.SecurityRoleService;
import com.wt.master.core.base.BaseController;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 角色管理控制器
 *
 * @author lichking2019@aliyun.com
 * @date May 13, 2019 at 9:26:36 AM
 */
@Api(value = "角色控制器", tags = "SecurityRoleController", description = "角色控制器")
@RestController
@RequestMapping("/securityRole")
@Slf4j
public class SecurityRoleController extends BaseController<SecurityRole, SecurityRoleService> {
    @Autowired
    private SecurityRoleService securityRoleService;

    @Override
    protected SecurityRoleService getService() {
        return securityRoleService;
    }
}
