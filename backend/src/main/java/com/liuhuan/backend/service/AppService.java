package com.liuhuan.backend.service;

import com.liuhuan.backend.model.dto.app.AppQueryRequest;
import com.liuhuan.backend.model.vo.AppVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.liuhuan.backend.model.entity.App;

import java.util.List;

/**
 * 应用 服务层。
 *
 * @author L_H
 * @since 2026-01-20 17:01:29
 */
public interface AppService extends IService<App> {

    /**
     * 获取应用封装类
     *
     * @param app
     * @return
     */
    AppVO getAppVO(App app);

    /**
     * 获取应用封装类列表
     *
     * @param appList
     * @return
     */
    List<AppVO> getAppVOList(List<App> appList);

    /**
     * 构造应用查询条件
     *
     * @param appQueryRequest
     * @return
     */
    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

}

