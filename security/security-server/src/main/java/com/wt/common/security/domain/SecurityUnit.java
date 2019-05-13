package com.wt.common.security.domain;

import com.wt.master.core.annotation.Id;
import com.wt.master.core.annotation.Table;
import com.wt.master.core.base.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * 机构实体
 *
 * @author lichking2019@aliyun.com
 * @date May 13, 2019 at 9:03:31 AM
 */
@Data
@Table(tableName = "SecurityUnitT")
public class SecurityUnit extends BaseEntity {
    /**
     * 机构Id
     */
    @Id(value = "unitId")
    private Serializable unitId;

    /**
     * 机构名称
     */
    private String unitName;

    /**
     * 父机构Id
     */
    private Serializable parentId;
}
