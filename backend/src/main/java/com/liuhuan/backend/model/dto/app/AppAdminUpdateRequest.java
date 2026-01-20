package com.liuhuan.backend.model.dto.app;

import lombok.Data;

import java.io.Serializable;

/**
 * @author L_H
 * @since 2026-01-20 17:12:51
 */
@Data
public class AppAdminUpdateRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 应用名称
     */
    private String appName;

    /**
     * 应用封面
     */
    private String cover;

    /**
     * 优先级
     */
    private Integer priority;

    private static final long serialVersionUID = 1L;
}