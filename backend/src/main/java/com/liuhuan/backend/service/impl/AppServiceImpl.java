package com.liuhuan.backend.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.liuhuan.backend.model.entity.App;
import com.liuhuan.backend.mapper.AppMapper;
import com.liuhuan.backend.service.AppService;
import org.springframework.stereotype.Service;

/**
 * 应用 服务层实现。
 *
 * @author L_H
 * @since 2026-01-20 17:01:29
 */
@Service
public class AppServiceImpl extends ServiceImpl<AppMapper, App>  implements AppService{

}
