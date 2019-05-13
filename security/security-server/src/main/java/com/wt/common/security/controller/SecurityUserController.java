package com.wt.common.security.controller;

import com.wt.common.security.domain.SecurityUser;
import com.wt.common.security.domain.SecurityUserRole;
import com.wt.common.security.service.SecurityUserRoleService;
import com.wt.common.security.service.SecurityUserService;
import com.wt.master.core.base.BaseController;
import com.wt.master.core.base.BaseControllerSecurityUser;
import com.wt.master.core.base.BaseService;
import com.wt.master.core.request.HttpResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * @ProjectName: study
 * @Package: com.wt.study.springboot.controller
 * @Description:
 * @Author: lichking2018@aliyun.com
 * @CreateDate: 2019-04-04 11:33
 * @Version: v1.0
 */
@RestController
@RequestMapping("/security/securityUser")
public class SecurityUserController extends BaseControllerSecurityUser {
    @Autowired
    private SecurityUserService securityUserService;

    @GetMapping(value = "/findAll")
    public HttpResultEntity findAll() {
        return getSuccessResult(securityUserService.findAll());
    }

    @PostMapping(value = "/add")
    public HttpResultEntity add(@RequestBody SecurityUser securityUser) {
        securityUserService.add(securityUser);
        return getSuccessResult(securityUser);
    }

    @DeleteMapping(value = "/delete/{id}")
    public HttpResultEntity delete(@PathVariable("id") Integer userId) {
        securityUserService.delete(userId);
        return getSuccessResult();
    }

    @PutMapping(value = "/update")
    public HttpResultEntity update(@RequestBody SecurityUser securityUser) {
        securityUserService.update(securityUser);
        return getSuccessResult();
    }

    @GetMapping(value = "/findById/{userId}")
    public HttpResultEntity findById(@PathVariable("userId") Integer userId) {
        return getSuccessResult(securityUserService.findById(userId));
    }

    @PutMapping(value = "/logicDelete/{userId}")
    public HttpResultEntity logicDelete(@PathVariable("userId") Serializable userId) {
        return getSuccessResult(securityUserService.logicDelete(userId));
    }

    @PostMapping(value = "/addBatch")
    public HttpResultEntity addBatch(@RequestBody List<SecurityUser> securityUserList){
        securityUserService.addBatch(securityUserList);
        return getSuccessResult();
    }

    @PutMapping(value="/updateBatch")
    public HttpResultEntity updateBatch(@RequestBody List<SecurityUser> securityUserList){
        securityUserService.updateBatch(securityUserList);
        return getSuccessResult();
    }


}
