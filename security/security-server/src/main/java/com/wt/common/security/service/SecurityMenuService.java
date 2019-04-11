package com.wt.common.security.service;

import com.wt.common.security.dao.SecurityMenuMapper;
import com.wt.common.security.domain.SecurityMenu;
import com.wt.master.core.base.BaseService;
import com.wt.master.core.base.support.ServiceSupport;
import org.springframework.stereotype.Service;

@Service
public interface SecurityMenuService extends BaseService<SecurityMenu> {
}
