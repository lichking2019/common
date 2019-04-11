package com.wt.common.security.domain;

import com.wt.common.security.enums.SexEnum;
import lombok.Data;

import java.util.Date;

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
    private int userId;

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
}
