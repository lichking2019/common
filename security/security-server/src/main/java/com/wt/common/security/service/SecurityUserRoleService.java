package com.wt.common.security.service;

import com.wt.common.security.domain.SecurityUserRole;
import com.wt.master.core.base.BaseService;

import java.io.Serializable;

/**
 * 用户角色服务
 *
 * @author lichking2019@aliyun.com
 * @date May 13, 2019 at 9:45:12 AM
 */
public interface SecurityUserRoleService extends BaseService<SecurityUserRole> {

    /**
     * 删除用户下的用户角色关系
     * @param userId 用户Id
     */
    void deleteRelationOfUser(Serializable userId);

}
