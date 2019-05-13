package com.wt.common.security.domain;

import com.wt.master.core.annotation.Id;
import com.wt.master.core.annotation.Table;
import com.wt.master.core.base.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * 菜单角色实体
 *
 * @author lichking2019@aliyun.com
 * @date May 13, 2019 at 9:34:05 AM
 */
@Data
@Table(tableName = "SecurityMenuRoleT")
public class SecurityMenuRole extends BaseEntity {

    @Id(value = "roleMenuId")
    private Serializable roleMenuId;

    /**
     * 菜单ID
     */
    private Serializable menuId;

    /**
     * 角色ID
     */
    private Serializable roleId;
}
