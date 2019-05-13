package com.wt.common.security.dao;

import com.wt.common.security.domain.SecurityMenu;
import com.wt.master.core.base.support.MapperSupport;
import com.wt.master.core.helper.MapperSqlHelper;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

/**
 * 菜单持久层
 *
 * @author lichking2019@aliyun.com
 * @date May 13, 2019 at 9:38:50 AM
 */
public interface SecurityMenuMapper extends MapperSupport<SecurityMenu> {
//    /**
//     * 由于需要在新增实体的时候，要返回主键，因此要重写
//     * @param entity
//     */
//    @Override
//    @InsertProvider(type = MapperSqlHelper.class, method = "add")
//    @Options(useGeneratedKeys = true, keyProperty = "entity.menuId")
//    void add(@Param(ENTITY) SecurityMenu entity);
}
