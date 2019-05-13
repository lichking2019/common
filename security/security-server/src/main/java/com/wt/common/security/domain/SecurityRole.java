package com.wt.common.security.domain;

import com.wt.master.core.annotation.Id;
import com.wt.master.core.annotation.Table;
import com.wt.master.core.base.BaseEntity;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 角色实体
 *
 * @author lichking2019@aliyun.com
 * @date May 13, 2019 at 9:01:45 AM
 */
@Data
@Table(tableName = "SecurityRoleT")
public class SecurityRole extends BaseEntity {
    /**
     * 角色Id
     */
    @Id(value = "roleId")
    private Serializable roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 包含的菜单列表
     */
    private List<Serializable> menuIdList;
}
