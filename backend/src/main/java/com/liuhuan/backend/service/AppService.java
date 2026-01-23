package com.liuhuan.backend.service;

import cn.hutool.core.util.StrUtil;
import com.liuhuan.backend.ai.model.enums.CodeGenTypeEnum;
import com.liuhuan.backend.common.ErrorCode;
import com.liuhuan.backend.exception.BusinessException;
import com.liuhuan.backend.exception.ThrowUtils;
import com.liuhuan.backend.model.dto.app.AppAddRequest;
import com.liuhuan.backend.model.dto.app.AppQueryRequest;
import com.liuhuan.backend.model.entity.User;
import com.liuhuan.backend.model.vo.AppVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.liuhuan.backend.model.entity.App;
import reactor.core.publisher.Flux;

import java.io.Serializable;
import java.util.List;

/**
 * 应用 服务层。
 *
 * @author L_H
 * @since 2026-01-20 17:01:29
 */
public interface AppService extends IService<App> {


    /**
     * 新增APP请求
     *
     * @param appAddRequest
     * @param loginUser
     * @return 新增APP的Id
     */
    Long createApp(AppAddRequest appAddRequest,User loginUser);


    /**
     * 通过对话生成应用代码
     *
     * @param appId 应用 ID
     * @param message 提示词
     * @param loginUser 登录用户
     * @return
     */
    Flux<String> chatToGenCode(Long appId, String message, User loginUser);

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


    /**
     * 项目部署
     *
     * @param appId
     * @param loginUser
     * @return 项目部署之后的地址
     */
    String deployApp(Long appId, User loginUser);

    /**
     * 删除应用时，关联删除对话历史
     *
     * @param id
     * @return
     */
    boolean removeById(Serializable id);


    /**
     * 异步生成应用截图并更新封面
     *
     * @param appId  应用ID
     * @param appUrl 应用访问URL
     */
    void generateAppScreenshotAsync(Long appId, String appUrl);
}

