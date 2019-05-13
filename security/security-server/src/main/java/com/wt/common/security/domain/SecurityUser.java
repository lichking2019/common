package com.wt.common.security.domain;

import com.wt.common.security.enums.SexEnum;
import com.wt.master.core.annotation.Transparent;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName: study
 * @Package: com.wt.study.springboot.domain
 * @Description: 用户实体
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-04-04 11:36
 * @Version: v1.0
 */
@Data
public class SecurityUser {
    /**
     * 用户ID
     */
    private Serializable userId;

    /**
     * 用户姓名
     */
    private String name;
    /**
     * 性别
     */
    private SexEnum sex;
    /**
     * 生日
     */
    private Date birthday;

    /**
     * 删除标识
     */
    private boolean deleteFlag;

    /**
     * 用户所属的机构Id
     */
    private Serializable unitId;

    /**
     * 用户对应的角色Id
     */
    @Transparent
    private List<Serializable> roleIdList;
}
