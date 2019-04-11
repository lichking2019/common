package com.wt.common.security.domain;

import com.wt.master.core.annotation.Id;
import com.wt.master.core.annotation.Table;
import com.wt.master.core.base.BaseEntity;
import lombok.Data;

@Data
@Table(tableName = "SecurityMenuT")
public class SecurityMenu extends BaseEntity {
    /**
     * 菜单ID
     */
    @Id("menuId")
    private Integer menuId;
    /**
     * 菜单名称
     */
    private String name;
    /**
     * 菜单链接
     */
    private String url;
    /**
     * 菜单图标
     */
    private String icon;
}
