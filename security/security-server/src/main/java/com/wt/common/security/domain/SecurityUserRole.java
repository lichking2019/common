package com.wt.common.security.domain;

import com.wt.master.core.annotation.Id;
import com.wt.master.core.annotation.Table;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * 用户角色关系实体
 *
 * @author lichking2019@aliyun.com
 * @date May 13, 2019 at 9:36:07 AM
 */
@Data
@Table(tableName = "SecurityUserRoleT")
public class SecurityUserRole {
    @Id(value = "userRoleId")
    private Serializable userRoleId;

    /**
     * 用户Id
     */
    private Serializable userId;

    /**
     * 角色Id
     */
    private Serializable roleId;

}
